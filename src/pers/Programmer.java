package pers;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class Programmer extends Person {
    private double startedStudying;

    public Programmer(long id, String fullName, byte age, char gender,
                      String gmail, String phoneNumber, double governmentSalary, double startedStudying) {
        super(id, fullName, age, gender, gmail, phoneNumber, governmentSalary);
        this.startedStudying = startedStudying;
    }


    @Override
    public void favoriteSport() {
        System.out.println(getFullName() + " favorite tennis ");
    }

    public double getStartedStudying() {
        return startedStudying;
    }

    public void setStartedStudying(double startedStudying) {
        this.startedStudying = startedStudying;
    }

    @Override
    public String favoriteLanguage() {
        return getFullName() + " favorite Java and C++";
    }

    @Override
    public Month favoriteMonth(int month) {
        return Month.of(month);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public String getFullName() {
        return super.getFullName();
    }

    @Override
    public void setFullName(String fullName) {
        super.setFullName(fullName);
    }

    @Override
    public byte getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(byte age) {
        super.setAge(age);
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }

    @Override
    public String getGmail() {
        return super.getGmail();
    }

    @Override
    public void setGmail(String gmail) {
        super.setGmail(gmail);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public double getGovernmentSalary() {
        return super.getGovernmentSalary();
    }

    @Override
    public void setGovernmentSalary(double governmentSalary) {
        super.setGovernmentSalary(governmentSalary);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void getYearofBirth() {
        super.getYearofBirth();
    }

    @Override
    protected LocalDate getYearOfBirth() {
        return super.getYearOfBirth();
    }

    @Override
    public String getPhoneNumberAndGmail() {
        return super.getPhoneNumberAndGmail();
    }

    public void getCareer() {
        if (getAge() - getStartedStudying() > 0) {
            if (getAge() - getStartedStudying() <= 2) {
                System.out.println(getFullName() + " Junior");
            } else if (getAge() - getStartedStudying() > 2 && getAge() - getStartedStudying() <= 4) {
                System.out.println(getFullName() + " Middle");
            } else {
                System.out.println(getFullName() + " Senior");
            }
        } else System.out.println("Still learning");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
