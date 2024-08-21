package collections;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {

        Set<Integer> hSet = new HashSet<>();
        hSet.add(25);
        hSet.add(5);
        hSet.add(5);
        hSet.add(5);
        hSet.add(13);

        System.out.println(hSet);

        //tree set pastreaza in ordine crescatoare; set inseamna
        //ca nu ne lasa sa punem aceleasi valori de mai multe ori
        Set<Integer> tSet = new TreeSet<>();
        tSet.add(25);
        tSet.add(5);
        tSet.add(5);
        tSet.add(5);
        tSet.add(13);

        System.out.println(tSet);
    }
}
