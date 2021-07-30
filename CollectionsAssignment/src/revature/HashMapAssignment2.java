package revature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapAssignment2 {
    //2. Write a Java program to count the number of key-value (size) mappings in a map.
    public static void main(String[] args) {
        System.out.println("\n**********");
        System.out.println("\n ******Java program to count the number of key-value (size) mappings in a map.******");

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

        System.out.println("The number of key-value pair in hashMap are: " + hashMap.size());
    }
}
