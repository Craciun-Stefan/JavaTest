package Introducerejava;

import java.util.Scanner;

public class exloopuri {
    public static void main(String[] args) {
        /*
       Write a program that requests the user to input a password and compare it to an existing password: P@ssword0
       Define and assign yourself this existing password, in your program
       If they are different, print "Incorrect password. Please try again" until the correct answer is introduced
       If they are not different, print "Login successful"
    */
        Scanner password = new Scanner(System.in);
        System.out.println("Introduce the password");
        String pass = password.nextLine();
        String realPassword = "P@ssword0";
      /*  for(int i = 1; i != 0; i++){
            if(pass != realPassword) {
                System.out.println("Incorrect password. Please try again");
                pass = password.nextLine();
            } else i = 0;
        }*/
        while(!pass.equals(realPassword)){
            System.out.println("Incorrect password. Please try again");
            pass = password.nextLine();
        }
        System.out.println("Login successful");
    }
}
