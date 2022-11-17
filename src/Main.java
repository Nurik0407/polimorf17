import pers.Doctor;
import pers.Driver;
import pers.Person;
import pers.Programmer;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Person doctor1 = new Doctor(1L, " Abdymomunov Sanzhar", (byte) 19, 'm',
                "sanjik@gmail.com", "0999372845", 20000, 15000);

        Doctor doctor2 = new Doctor(2L, "Akbaraliev Dastan", (byte) 18, 'm',
                "das@gmail.com", "05049278462", 40000, 30000);


        Person driver1 = new Driver(3L, "Dzhon Whick", (byte) 24, 'j',
                "joni@gmail.com", "05566783484", 0, 14);

        Driver driver2 = new Driver(4L, "Orozaliev Baiysh", (byte) 22, 'm',
                "baiysh@gmail.com", "0705748392", 0, 16);


        Person programmer1 = new Programmer(5L, "Zholdoshov  Nuradil", (byte) 18, 'm',
                "nurik@gmail.com", "0500322332", 15000, 16);

        Programmer programmer2 = new Programmer(6L, "Shabdanov Ilim", (byte) 18, 'm',
                "ilim@gmail.com", "0703827483", 20000, 14);


        Person[] people = {doctor1, doctor2, driver1, driver2, programmer1, programmer2};


        for (Person person : people) {
            System.out.println(person);
            if (person instanceof Doctor) System.out.println(((Doctor) person).incomeAndSalary());
            person.favoriteSport();
            System.out.println(person.favoriteLanguage());
            System.out.println(person.getFullName() + " favotite month " + person.favoriteMonth(3));
            System.out.println(person.getLastName());
            person.getYearofBirth();
            System.out.println(person.getPhoneNumberAndGmail());
            if (person instanceof Driver) System.out.println(((Driver) person).drivingExperience());
            if (person instanceof Programmer) ((Programmer) person).getCareer();
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


        }
    }
}