package Introducerejava;

import java.util.Arrays;

public class arrayuri {
    public static void main(String[] args) {
        int[] note = {1, 2, 10, 14, 93, 32}; //asa se creaaza array-ul, cu paranteze patrate
        System.out.println(note[0]);
        System.out.println(Arrays.toString(note));

        String[] limbajeProg = {"C", "C++", "Java", "Python", "JavaScript", "PHP"};

        limbajeProg[4] = "alt limbaj";
        System.out.println(limbajeProg[4]);

        String[] serviciiWeb = new String[3];
        serviciiWeb[1] = "sdewe";
        int l1 = serviciiWeb.length;
        System.out.println(l1);

        // multi-dimensional array
        char[][] mult1 = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'}
        };
        System.out.println(mult1[0][2]);

    }
}
