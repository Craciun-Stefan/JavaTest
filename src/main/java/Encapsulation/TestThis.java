package Encapsulation;

public class TestThis {
    private int i;

    public TestThis(int i){ //constructorul trebuie sa aiba denumirea clasei neaparat
        this.i = i;
        //cu i = i; metoda returneaza valoarea de instanta a lui i si anume 0
    }

    public static void main(String[] args) {
        TestThis intVal = new TestThis(3);
        System.out.println("Value of I is " + intVal.i);
    }
}
