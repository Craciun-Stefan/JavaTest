package Introducerejava;

public class Main {
    // The JRE on your computer must call the main method to trigger the program to run
    // It is Public because this should be available to be called from outside the class - The JRE should have access to run it
    // Being Static, the call will be directly on this class. It's not going to be called on an instance of this class
    // Void is the return type of the method - It doesn't have to return something
    // It is called "main" because the JRE will call your class "main" when executing it, so the name of the method also has to be the same
    // String[] args - An array of strings that are arguments which can be passed to the program
    // The code inside the "main" method will be executed when we run our program
    // All other methods that you create, must be placed outside the "main" method, and you only call theme inside it
//informatii despre metoda main
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

    }
}
