package ExceptionsDebug;

import java.util.Scanner;

public class Debug {

    public static void main(String[] args) {

        int nr1;
        int nr2;

        Scanner scan1 = new Scanner(System.in);
        System.out.println("ENtr the 1st nr");
        nr1 = scan1.nextInt();
        System.out.println("Entr 2nd nr");
        nr2 = scan1.nextInt();

        int sum = nr1 + nr2;
        System.out.println("Sum of the nrs is: " + sum);
    }
}
