package Streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCSV {

    public static void main(String[] args) {

        String path = "C:\\Users\\Ralu\\Downloads\\2015.csv";
        String row;
        try{
            BufferedReader buffReader = new BufferedReader(new FileReader(path));
            while((row = buffReader.readLine()) != null){

                //System.out.println(row);
                String[] entries = row.split(",");
                System.out.println("Country: " + entries[0] + " , GDP" + entries[5]);

            }
            buffReader.close();
        } catch (Exception e){
            System.out.println(e);
        }


    }
}
