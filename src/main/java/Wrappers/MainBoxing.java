package Wrappers;

public class MainBoxing {
    public static void main(String[] args) {

        Integer I = 123;
        Double D = 2.53;
        Character C = '*';
        Boolean B = true;
        String S = "txt";

        if(B.equals(true)){
            System.out.println("True bool");
        }

        //1. Autoboxing - Converting primitive data types into objects

        int i = 5;
        Integer val = new Integer(i); //using constructor
        Integer val1 = Integer.valueOf(i); // using this saves memory
        System.out.println(val1.compareTo(6));
        System.out.println(val);

        // 2. Unboxing - Converting the wrapper class to a primitive data type, using the same "val" object
        int j;
        j =val1.intValue(); //conversia lui i in tip de data primitiva
        System.out.println(j+4);


    }
}
