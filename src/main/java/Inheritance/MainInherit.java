package Inheritance;

public class MainInherit {
    public static void main(String[] args) {
        Module1 Agile = new Module1();
        Agile.infoModule();
        //Agile.defaultLocation();
        //System.out.println("Location: " + Agile.location);
        System.out.println("Tite: " + Agile.subject);
        System.out.println("Duration HR: " + Agile.duration);
        System.out.println("Evaluation: " + Agile.test);
        Agile.endCourse("12.06.2024");

        System.out.println();

        Module2 VersContr = new Module2();
        VersContr.infoModule();
        System.out.println("Location: " + VersContr.location);
        System.out.println("Tite: " + VersContr.subject);
        System.out.println("Duration HR: " + VersContr.duration);
        System.out.println("Evaluation: " + VersContr.test);
        VersContr.endCourse("23.06.2024");

    }
}
