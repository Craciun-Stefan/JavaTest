package Introducerejava;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class DeleteFIles {

    static final String localFolder = "D:\\Stick+old laptop";
    public static void main(String[] args) {
    deletFiles(localFolder);

    }
    public static void deletFiles(String fld){
        File folders = new File(fld);
        for(File entry : folders.listFiles()){
            if (entry.isDirectory() == false){
                String fileName = entry.getName().toLowerCase();
                if(fileName.endsWith("log") || fileName.endsWith("rar")){
                    entry.delete();
                }
            }
        }
        System.out.println("Files removed");
    }
}
