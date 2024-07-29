package Introducerejava;

import java.util.Scanner;

// Write a program that requests the full name of the user, and prints it (in upper case)
// after the message "Hello, ", with the use of a method
public class ExMetode {
    public static void main(String[] args) {
        Scanner nme = new Scanner(System.in);
        System.out.println("Introduce your first name");
        String name = nme.nextLine();
        Scanner prenme = new Scanner(System.in);
        System.out.println("Introduce your second name");
        String secondName = prenme.nextLine();
        printupper(name, secondName);
    }
    static void printupper(String nume, String prenume)
    {
        String nume1 = nume.toUpperCase();
        String prenume1 = prenume.toUpperCase();
        System.out.println("Hello " + nume1 + " " + prenume1);
    }
}
//alta abordare mai usoara: pe drive
