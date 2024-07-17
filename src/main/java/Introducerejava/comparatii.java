package Introducerejava;

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
        for (int i3 = 0; i3++ < array.length -1; ){
            System.out.println(array[i3]);
        }
    }
}
