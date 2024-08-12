package Polymorphism;

public class MainCompilers {
    public static void main(String[] args) {
        Compilers compilers = new Compilers();
        IntelliJ intelliJ = new IntelliJ();
        PyCharm pyCharm = new PyCharm();

        System.out.println(compilers.info);
        compilers.compile();
        intelliJ.compile();
        pyCharm.compile();

        Compilers[] comp = {compilers, intelliJ, pyCharm};
                for(Compilers denumire: comp){
                    denumire.compile();
                }

    }
}
