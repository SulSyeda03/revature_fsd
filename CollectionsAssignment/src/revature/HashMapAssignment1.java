package revature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapAssignment1 {
    //1. Write a Java program to associate the specified value with the specified key in a HashMap.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to associate the specified value with the " +
                "specified key in a HashMap.******");

        HashMap<Integer,String> hashMap = new HashMap<>();
        System.out.print("\nHashMap before adding elements : ");
        System.out.println(hashMap.entrySet());

        //Adding elements in HashMap
        System.out.println("Adding keys and values to it in HashMap...");
        hashMap.put(1 , "New York");
        hashMap.put(2 , "Chicago");
        hashMap.put(3 , "Los Angeles");
        hashMap.put(4 , "Michigan");

        //Printing contents
        System.out.println("Printing the contents of HashMap ");
        System.out.println(hashMap.entrySet());

        //Traversing through elements using iterator
        System.out.println("\nTraversing through elements using iterator: ");
        Set set = hashMap.entrySet();

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }


    }
}
