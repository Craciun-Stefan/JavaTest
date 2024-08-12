package Encapsulation;

public class Participants {
    public static void main(String[] args) {
        Trainee T1 = new Trainee("Alex Smif", "ID007");
        //T1.setFullName("Alex Smif");
        //T1.setID("ID007");

        Trainee T2 = new Trainee("Chap Lad", "ID009");
        //T2.setFullName("Chap Lad");
        //T2.setID("ID009");
        System.out.println(T1.getFullName());
        System.out.println(T1.getID());

        System.out.println(T2.getFullName());
        System.out.println(T2.getID());
    }
}
