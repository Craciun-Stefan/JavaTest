package ExceptionsDebug;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        checkAge(19);
//Ex. 1
        //  int[] arr1 = {1,3,5};

        //System.out.println(arr1[3]); //exemplu exception
        try {
            int[] arr2 = {1, 3, 5};
            System.out.println(arr2[3]);
        } catch (Exception e) { //cel mai des intalnit, conventie
            System.out.println("No value for that index");
        }

        //Ex. 2

        int[] arr3 = null;
        try {
            System.out.println(arr3[1]);
        } catch (NullPointerException e) {
            System.out.println("The arr is null");
        }


        //Ex. 3


        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Pls entr the 1st number");
            int nr1 = input.nextInt();
            System.out.println("PLs entr the 2nd nuber");
            int nr2 = input.nextInt();

            int div = nr1 / nr2;

            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0");
        } finally { //ruleaza indiferent de outcome
            System.out.println("End of exec");
        }


//4. Custom exceptions
       // Scanner input = new Scanner(System.in);
        System.out.println("Pls entr paw");
        String pw = input.nextLine();
        try {
            checkPw(pw);
        } catch (CustomExcep e) {
            throw new RuntimeException(e);
        }
    }
    static void checkAge(int age){
        if (age < 18){
            throw new ArithmeticException("Acses dinaid you is young");
        } else {
            System.out.println("Aceses grented you is old");
        }
    }
    static void checkPw(String pw1) throws CustomExcep{
        if (pw1.equals("PW1")){
            throw new CustomExcep("Acses grenated");
        } else {
            throw new CustomExcep("Acces denied");
        }
    }



}
