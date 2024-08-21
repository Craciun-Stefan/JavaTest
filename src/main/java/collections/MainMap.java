package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {

    public static void main(String[] args) {

        //HashMap<Integer, String> StudentsIDs = new HashMap<>();
        Map<Integer, String> StudentsIDs = new HashMap<>(); //mai bine decat varianta de mai sus ca sa nu folosesti doar ce ofera HashMap

        StudentsIDs.put(1, "Alex S");
        StudentsIDs.put(2, "Mj I");
        StudentsIDs.put(3, "Hbdulah A");
        System.out.println(StudentsIDs.keySet());
        System.out.println(StudentsIDs.values());

        System.out.println(StudentsIDs.entrySet());

        StudentsIDs.remove(2);
        System.out.println(StudentsIDs);

        //Print value based on the ID
        String studentName = StudentsIDs.get(1);

        if(StudentsIDs.containsKey(1)){
            System.out.println("The 1st student is: " +studentName);
        }

        //TreeMap
        Map<Integer, String> keysMap = new TreeMap<>();

        keysMap.put(20, "K1");
        keysMap.put(30, "K3");
        keysMap.put(10, "K2");

        System.out.println(keysMap);

        keysMap.entrySet().forEach(X -> System.out.println(X)); // expresie lambda

        keysMap.entrySet().forEach( System.out::println); //simplificare pentru metoda lambda, method reference se numeste

    }
}
