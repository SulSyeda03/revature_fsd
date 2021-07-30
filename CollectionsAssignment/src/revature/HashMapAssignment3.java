package revature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapAssignment3 {
    //3. Write a Java program to copy all of the mappings from the specified map to another map.

    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to copy all of the mappings from the specified map to another map.******");

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1 , "New York");
        hashMap.put(2 , "Chicago");
        hashMap.put(3 , "Los Angeles");
        hashMap.put(4 , "Michigan");

        System.out.println("Printing the contents of HashMap ");
        System.out.println(hashMap.entrySet());

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nCopying all of the mappings from hashMap to h_map...");
        HashMap<Integer,String> h_map = new HashMap<>();
        h_map.putAll(hashMap);
        System.out.println("\nPrinting the contents of HashMap ");
        System.out.println(hashMap.entrySet());
        System.out.println("\nPrinting the contents of h_map ");
        System.out.println(h_map.entrySet());

    }
}