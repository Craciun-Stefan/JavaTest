package Introducerejava;

import java.util.Scanner;

public class Introdjava {

    public static void main(String[] args)  {

        System.out.println("Hello");
// Output Text:
        System.out.println("Text with a quote \"quote\"");                                      // to use "" in a paragraph
        System.out.println("This project is located in: C:\\Users\\Public");                            // to use / in a paragraph
        System.out.println("Text with a tab (blank space):   and other text after that");       // to add space in a paragraph
        System.out.println("This is text \n on  \n multiple \n lines");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Tell me your name");

        String nume = input1.nextLine();
        System.out.println("Welcome " + nume);
        // to add a new line
    }

}
