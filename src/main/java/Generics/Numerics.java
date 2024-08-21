package Generics;

public class Numerics <T extends Number>{

    //// Bounded Types - You bound the type of the generic to a specific type (Numbers in this case)
    T val;

    Numerics(T obj){
        this.val = obj;
    }

    double square(){
        return val.intValue() * val.intValue();
    }
    boolean areEqual(Numerics<?> obj){ //conceptul de wildcard: avem semnul intrebarii
        if(Math.abs(val.doubleValue()) == Math.abs(obj.val.doubleValue()))
            return true;
        return false;
    }
}


