package Objects;

import java.time.Year;

public class ExObjects {
    /*
    Create a "Student" class that has the following attributes:
    - First name
    - Last name
    - Year of birth
    - Phone number

    In the "ExObjects" class, create a student object
    Provide values for those attributes and print out: "Full name: first name & last name"
    Calculate his age with a method and print the result in the following format: "Age: (result of the calculation)"
    Print out the full phone number: "Phone number: 0xxxxxxxxx"
    */   static int age(int year)
    {
        int actualyear = Year.now().getValue();
        int realAge = actualyear - year;
        System.out.println("Age: " + realAge);
        return 0;
    }
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.firstName = "Gheo";
        stud1.lastName = "Popa";
        stud1.yearOfBirth = 1990;
        stud1.phoneNumber = "0734234943";
        System.out.println("Full name: " + stud1.firstName + " " + stud1.lastName);
    age(stud1.yearOfBirth);
        System.out.println(stud1.phoneNumber);

    }

}
