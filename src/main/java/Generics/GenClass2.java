package Generics;

public class GenClass2 <T, V>{
    T v1;

    V v2;

    GenClass2(T v1, V v2){
        this.v1 = v1;
        this.v2 = v2;
    }
    public T getVal1(){
        return v1;
    }
    public V getVal2(){
        return v2;
    }
}
