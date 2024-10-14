package Introducerejava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExFlutterJava {

    public static void main(String args[]) throws Exception {
        //BufferedReader
        Scanner nota = new Scanner(System.in);
        int A = nota.nextInt();                // Reading input from STDIN
        int B = nota.nextInt();
        //System.out.println("Hi, please enter your name!");

        nota.close();
        sol(A, B);

    }
    static int sol(double A, double B){
        int x=0;
        int y=0;
        int result = 0;
        if(Math.floor(A/B) != A/B){
            while(Math.floor((y+B)/(x+A)) != (y+B)/(x+A)){
                x++;
                if(x > y){
                    x = x-1;
                    y++;
                    result++;
                } else result++;
            }
        } else{
            System.out.println(result);
        }
        System.out.println(result);
        return result;
    }

}
