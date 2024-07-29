package Introducerejava;

import java.nio.charset.StandardCharsets;

public class Metode {
    public static void main(String[] args) {

        //1. Metode existente

        String title = "Text";
        // System.out.println(title.toUpperCase());

        // 2. Custom methods:
// Ex. 1
       // print(title, "Hellou");

        //Ex. 2
        //sum(1, 3);
        //Ex. 3
        int result = sum2(3, 10);
        // Ex. 4 - Calculate the sum of the elements of an array
        int[] note = {1, 2, 10, 14, 93, 22, 32};

        int sumArr = addArray(note);
        print("The sum of the array is ", sumArr);
        //sau se mai poate:
        //sout(addArray(note));
    }

    // Ex. 1 de metoda
    static void print(String word, int word2) {
        System.out.println(word + word2);
    }

    //Ex. 2 - Sum of 2 numbers
    static void sum(int nr1, int n2) {
        System.out.println(nr1 + n2);
    }

    //Ex. 3.
    static int sum2(int nr1, int nr2) {
        int sum = nr1 + nr2;
        System.out.println(sum);
        return sum;
    }
        //cand tipul de date este int trebuie folosit return
        // Ex. 4. Sum of array elements

    /**
     * Function for adding the elements of an array
     * Comentarii speciale pentru functie cu / si doua stelutze
     *
     * @param arr
     * @return sum of elements
     */
    static int addArray(int[] arr){
            int add=0;
            for(int i=0; i<arr.length; i++){
                add +=arr[i];
            }
            return add;

        }

    }
