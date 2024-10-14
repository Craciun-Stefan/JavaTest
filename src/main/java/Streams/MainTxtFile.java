package Streams;

import java.io.*;
import java.util.logging.Level;

public class MainTxtFile {

    public static void main(String[] args) {

        try{
            //write in a .txt file
            Log newLog = new Log("C:\\Users\\Ralu\\IdeaProjects\\JavaTest\\LogFile.txt"); //creare fisier de log
            newLog.log.setLevel(Level.INFO);
            newLog.log.info("New file => log info(fill with 3 entries)");
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\Ralu\\Downloads\\NewFile.txt"));

            buffWriter.write("1Citire entry\n2");
            buffWriter.write("Citire entry\n3");
            buffWriter.write("Citire entry\n ");

            buffWriter.close();
        } catch (Exception e){
            System.out.println(e);

        }

        //Read from a .txt file
        try{
            BufferedReader buffReader = new BufferedReader(new FileReader("C:\\Users\\Ralu\\Downloads\\NewFile.txt"));
            String entry;
            while((entry = buffReader.readLine()) !=null){
                System.out.println(entry);
            }
            buffReader.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }


}
