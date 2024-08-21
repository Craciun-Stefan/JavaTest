package Generics;

public class GenericMethod {

    public static void main(String[] args) {

        Integer[] intArr = {0, 1, 2, 3, 4};
        Double[] doubleArr = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArr = {'a', 'b', 'c', 'd', 'e'};
        String[] strArr = {"this", "is", "a", "string", "array"};

        displayElements(doubleArr);

        /* metoda greoaie, faci o metoda pentru fiecare tip de data; fara GENERICS
        displayElements(intArr);
        System.out.println();
        displayElements(doubleArr);
        System.out.println();
        displayElements(charArr);
        System.out.println();
        displayElements(strArr);
    }
*/
    }
    /*
    public static void displayElements(Integer[] arr){
        for(Integer e : arr){
            System.out.println(e + " ");
        }
    }
    public static void displayElements(Double[] arr){
        for(Double e : arr){
            System.out.println(e + " ");
        }
    }
    public static void displayElements(String[] arr){
        for(String e : arr){
            System.out.println(e + " ");
        }
    }
    public static void displayElements(Character[] arr){
        for(Character e : arr){
            System.out.println(e + " ");
        }
    }

         */
        public static <T> void displayElements (T[] arr){
            for (T e : arr) {
                System.out.println(e + " ");
            }
            System.out.println();
        }

    }

