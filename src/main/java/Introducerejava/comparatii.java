package Introducerejava;

import java.util.Scanner;

public class comparatii {

    public static void main(String[] args) {

        // Operators are used to perform operations on variables and values

        // 1. Arithmetic operators
        // 2. Assignment operators
        // 3. Comparison operators
        // 4. Conditional operators - Logical & Ternary

        // 1. Arithmetic Operators
        /*
            +	Addition
            -	Subtraction
            *	Multiplication
            /	Division
            %	Modulus	Returns the division remainder
            ++	Increment	Increases the value of a variable by 1
            --	Decrement	Decreases the value of a variable by 1
         */

        int result = 1+2;

        System.out.println(result);

        // pre-incremental operator - it increments the value of the operand BEFORE using it in an expression.
       // int i = 0;
        //int j = i++;
        //versus ++i
       // System.out.println(j);
       // System.out.println(i);

        int[] array = {0,1,2,3};
        //for (int i3 = 0; i3++ < array.length -1; ){
            //System.out.println(array[i3]);

        int i1=0;
        int j1= i1++;

        System.out.println(i1);
        System.out.println(j1);
       /* for (int i4 = 0; i4++ < array.length; )

    {
        System.out.println(array[i4]);
    }*/
        // 2. Assignment operators
        /*
            =
            +=
            -=
            *=
            /=
            %=
        */
        // a = a + b acelasi lucru cu a +=b;
        // 3. Comparison Operators:
        /*
            8 > 9;
            8 < 9;
            8 >= 9;
            8 <= 9;
            8 == 9; compara
            8 != 9; diferit
        */
        int vl1 = 8;
        int vl2 = 9;
        boolean b1 = (vl1 == vl2);
        System.out.println(b1);
        //comparison operators with if
        //int val3 = 12;

        //if(val3 == 12){
         //  System.out.println("comparatia functionaza");
       // }
        //4. Operatori conditionali
        //4.1. Operatori logici - or, and, not
        //or: || (asa arata or in java)
        int val3 = 12;

        if(val3 == 9 || val3 == 12){
            System.out.println("o valoare este adevarata");
            //acelasi lucru si cu and and se scrie: &&
        }
        // not se scrie ! gen diferit
        /*Scanner scan = new Scanner(System.in);
        System.out.println("To log out of your account, press y or Y");
        String input = scan.nextLine();
        if(!input.equals("y") && !input.equals("Y")){
            System.out.println("Esti logat patroane");
        }
        else {
            System.out.println("The log out was succesfullt");
        }*/
        //4.2. Ternary Operator
        int x = (5 > 2) ? 5 : 2;
        //int x = (5 > 2) ?  5(ce este adevarat) : 2(ce este fals);
        System.out.println(x);

    }
}
