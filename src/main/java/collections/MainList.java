package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//sau puteam java.util.* care ia toate pachetele din
//Colectiile in loc de a folosi Variabile statice
public class MainList {

    public static void main(String[] args) {

        List<String> arrList1 = new ArrayList<>();

        arrList1.add("E1");
        arrList1.add("E2");
        arrList1.add("E3");
        System.out.println(arrList1);

        //Remove elements

        arrList1.remove("E2");

        System.out.println(arrList1);

        arrList1.remove(0);
        System.out.println(arrList1);

        //Check for an element
        if (arrList1.contains("E3")) {
            System.out.println("Contains E3");
        }

        //Remove

        arrList1.remove(arrList1.size() - 1);


        //Check if list in empty
        if (arrList1.isEmpty()) {
            System.out.println("List is empty");
        } else System.out.println("List is not empty");



    //Size of ar ArrayList
  //  int size = arrList1.size();
        System.out.println(arrList1.size());
// 1. ArrayList - It uses an Array to store the actual elements
        //    - We don't need to specify the limit number of elements. The Array will grow when adding new elements
        //    - An ArrayList has a bigger time complexity compared to a normal Array

    List <Integer> intList = new ArrayList<>();
    intList.add(Integer.valueOf(1));
    intList.add(Integer.valueOf(2));
    intList.add(Integer.valueOf(3));
    intList.add(Integer.valueOf(4));

    int i = 5;

    Integer val = Integer.valueOf(i);
    intList.add(val);
        System.out.println(intList);
        for(int i1 : intList){
            System.out.println(i1 + " ");
        }
        // 2. LinkedList
        List<String> linkList1 = new LinkedList<>();

        linkList1.add("E1");
        linkList1.add("E2");
        linkList1.add("E3");

        System.out.println(linkList1);

        linkList1.add(1, "E4");
        System.out.println(linkList1);
        }

}






