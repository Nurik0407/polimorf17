package pers;

import java.time.LocalDate;
import java.time.Month;

public abstract class Person {
    private long id;
    private String fullName;
    private byte age;
    private char gender;
    private String gmail;
    private String phoneNumber;

    private double governmentSalary;

    public Person(long id, String fullName, byte age, char gender, String gmail, String phoneNumber, double governmentSalary) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.governmentSalary = governmentSalary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    /**
     * Get and Sat
     **/

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGovernmentSalary() {
        return governmentSalary;
    }

    public void setGovernmentSalary(double governmentSalary) {
        this.governmentSalary = governmentSalary;
    }

    /**
     * Methody
     **/

    public abstract void favoriteSport();

    public abstract String favoriteLanguage();

    public abstract Month favoriteMonth(int month);

    public String getLastName() {  // vozvrashaet surname
        return getFullName().substring(0, getFullName().lastIndexOf(' '));
    }

    public void getYearofBirth() {
        System.out.println(getYearOfBirth());
    }

    protected LocalDate getYearOfBirth() {
        return LocalDate.now().minusYears(getAge());
    }

    public String getPhoneNumberAndGmail() {
        return "Phone Number and Gmail: " + getPhoneNumber() + "," + getGmail();
    }

    public static long[] getPeopleOfAllAges(Person[] people) {
        return null;
    }

    @Override
    public String toString() {
        return "Person\n" +
                "id: " + id +
                "\nfullName: " + fullName +
                "\nage: " + age +
                "\ngender: " + gender +
                "\ngmail: " + gmail +
                "\nphoneNumber: " + phoneNumber +
                "\ngovernmentSalary: " + governmentSalary;
    }
}
