package Introducerejava;

import java.util.Scanner;

public class exconditii {
    /*
    Write a program that accepts a test grade and prints out the following statements:
    - "Insufficient" if the grade is less than 5
    - "Sufficient" if the grade is between 5 and 6
    - "Good" if the grade is greater than 6 and smaller than 9
    - "Very good" if the grade is greater than 8
    */
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Tell me your grade");
        int grade = nota.nextInt();
        if(grade < 5 && grade >=1){
            System.out.println("Insufficient");
        } else if(grade >= 5 && grade <= 6){
            System.out.println("sufficient");
        } else if(grade >= 6 && grade <9){
            System.out.println("Good");
        } else if(grade >=9 && grade <=10){
            System.out.println("Very good");
        }else {
            System.out.println("Your grade must be a number between 1 and 10");
        }
    }
}
