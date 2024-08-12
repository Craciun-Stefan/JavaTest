package Package2;

import AbstractInterfaces.SubjectsI;
import Package1.P1Class1;

public class SubP1Class1 extends P1Class1 {
    public static void main(String[] args) {

        SubP1Class1 C1 = new SubP1Class1();
        System.out.println(C1.proVar); //putem accesa proVar pentru ca SubP1Class1 mosteneste P1Class1, altfel nu se putea
    }
}
