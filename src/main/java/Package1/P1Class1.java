package Package1;

import Package2.P2Class1;

public class P1Class1 {

    protected String proVar = "Protected Variable";
    public static void main(String[] args) {
        P2Class1 C2 = new P2Class1();
        System.out.println(C2.pubVar);
       // System.out.println(C2.defVar); nu apare pentru ca nu e publica variablia
      //  P1Class2 C2 = new P1Class2();
        //System.out.println(C2.priVar); //variablia privata poate fi apelata doar in clasa in care a fost creata
    }
}
