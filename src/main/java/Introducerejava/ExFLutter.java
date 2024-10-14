package Introducerejava;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class ExFLutter {

    public static void main(String args[]) throws Exception {
        //BufferedReader
        System.out.println("Hi, please enter your name!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name1 + ".");    // Writing output to STDOUT
        System.out.println(name1 + ", please enter the likes and dislikes");
        String A = br.readLine();
        System.out.println("Hi, please enter your name!");
        String name2 = br.readLine();
        System.out.println("Hi, " + name2 + ".");
        System.out.println(name2 + ", please enter the likes and dislikes");
        String P = br.readLine();
        br.close();
        int both = 0; //the value of the topics they like
        if (A.length() != P.length()) {
            System.out.println("The number of the topics must be equal");
        } else {
            for (int i = 0; i < A.length(); i++) {
                if ((A.charAt(i) == '1' && P.charAt(i) == '1') || (A.charAt(i) == '0' && P.charAt(i) == '0')) {
                    both++;
                }
                System.out.println("The number of topics they both like or dislike is " + both);
            }
        }
    }
}
