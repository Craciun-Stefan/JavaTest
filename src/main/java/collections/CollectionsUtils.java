package collections;

import java.util.*;

public class CollectionsUtils {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(2);
        intList.add(1);
        intList.add(1);
        intList.add(3);

        Collections.sort(intList);
        System.out.println(intList);

        System.out.println(Collections.binarySearch(intList, 4));
        System.out.println(Collections.frequency(intList, 1));
        System.out.println(Collections.min(intList));//printeaza minim

        Collections.swap(intList, 2 ,3);
        System.out.println(intList);

        List<Object> mixList = new ArrayList<>();
        mixList.add(12);
        mixList.add(2.5);
        mixList.add('c');
        mixList.add("tct");

        System.out.println(mixList);


    }
}
