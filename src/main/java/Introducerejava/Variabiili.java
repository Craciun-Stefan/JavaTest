package Introducerejava;

import java.util.Locale;


public class Variabiili {

    static final int MAX_NR = 100;
    public static void main(String[] args) {
        /* Data Types

           1. Primitive

             - byte
             - short
             - int
             - long
             - float
             - double
             - char
             - boolean

           2. Non-Primitive or reference

             - String
             - Arrays
             - Objects
             - Interfaces
             etc.

           3. Type Casting
    */
        byte b1 = 0;
        short s1;
        s1 = 10;
        int i3 = 45;
        int i5 = -500, i4 = 32;
        System.out.println(i3);

        long l1 = 12310444444433333L;
        float f1 = 3.4F;
        double d1 = 23134.45;

        char c1 = '*';
        boolean bi1 = true;

        boolean bi2 = (s1 == i3);
        System.out.println(bi2);

        // al doilea tip de date, non primitive

        String sir1 = "Neaparat pune glilimele";
        System.out.println(sir1.toUpperCase());
        final int MAX_NR = 190;
        //MAX_NR=19;
        System.out.println(MAX_NR);

        //tipul 3 de variabile

        //Widening
        int myInt1 = 1;
        double myDouble1 = myInt1; //automatic casting
        System.out.println(myInt1);
        System.out.println(myDouble1);

        //narrowing
        double myDouble2 = 5.56;
        int myInt2 = (int) myDouble2; //manual casting
        System.out.println(myInt2);
        System.out.println(myDouble2);
    }
}
