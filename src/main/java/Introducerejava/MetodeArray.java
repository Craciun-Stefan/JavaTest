package Introducerejava;

import java.util.ArrayList;
import java.util.Arrays;

public class MetodeArray {
    public static void main(String[] args) {
        int[] note = {1, 2, 10, 14, 93, 32};

        String[] limbajeProg = {"C", "C++", "Java", "Python", "JavaScript", "PHP"};

        String[] serviciiWeb = new String[3];
        serviciiWeb[0] = "sdewe";
        serviciiWeb[1] = "html";
        serviciiWeb[2] = "google";

        //print all elem in array
        //for (String prog : limbajeProg) {
           // System.out.println(prog);
        //1. Fill a new array with values
        //int[] arr = new int[4];
       // Arrays.fill(arr, 55);
      //  for (int e : arr){
        //    System.out.println(e + " ");

            //2. copy from an existing array into a new array
            int[] newGrades = Arrays.copyOf(note, note.length);

            //for( int i : newGrades){
              //  System.out.println(i+ " ");

            //3. Test if 2 array are equal
            System.out.println(Arrays.equals(note, newGrades));
//4. Sort the values in an array
        Arrays.sort(note);

        for(int i: note){
            System.out.println(i + " ");
        }
        //5. Remove element from an Array(with asList)
        // nu se poate scoate un element din array normal, trebuie
        //facut arraylist
        ArrayList<String> aList = new ArrayList<>(Arrays.asList(serviciiWeb));
        aList.remove(1);
        System.out.println(aList);

        //6. Cautare binara - Returns the Index of an Element from an Array. It does not sort it, so it's better to do that first

        //System.out.println(Arrays.binarySearch(note, 6));
                ;
        }

    }

