package Generics;

public class MainGeneric {

    public static void main(String[] args) {
// 1. Non-generic classes with different data types
        IntClass newInt1 = new IntClass(8);
        CharClass newChar1 = new CharClass('x');

        System.out.println(newInt1.getVal());
        System.out.println(newChar1.getVal());
//2. Generic class with one parameter
        GenClass1<Integer> newInt2 = new GenClass1<>(8);
        GenClass1<Character> newChar2 = new GenClass1<>('X');

        System.out.println(newInt2.getVal());
        System.out.println(newChar2.getVal());
        //3. Generic class with mutiple parameters;
        GenClass2<Integer, Integer> newInt3 = new GenClass2<>(3,7);
        GenClass2<Integer, Character> newIntChar2 = new GenClass2<>(4, 'y');
        System.out.println(newInt3.getVal1());
        System.out.println(newInt3.getVal2());
        System.out.println();
        System.out.println(newIntChar2.getVal1());
        System.out.println(newIntChar2.getVal2());

        //4. Calculation with generics
        Numerics<Integer> calc1 = new Numerics<>(4);
        System.out.println(calc1.square());

        //5. Wildcards
        Numerics<Double> calc2 = new Numerics<>(4.7);
        System.out.println(calc1.areEqual(calc2));
    }
}
