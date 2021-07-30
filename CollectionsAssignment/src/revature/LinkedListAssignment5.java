package revature;

import java.util.LinkedList;

public class LinkedListAssignment5 {
    //5. Write a Java program to insert the specified element at the specified position in the linked list.

    public static void main(String[] args) {

        System.out.println("\n**********");
        System.out.println("\n ******Java program to insert the specified element at the specified position in the linked list.******");

        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("New York");
        linked_list.add("Chicago");
        linked_list.add("California");
        linked_list.add("Washington");
        linked_list.add("San Francisco");
        linked_list.add("Seattle");
        linked_list.add("Denver");
        linked_list.add("Boston");
        linked_list.add("Washington");

        System.out.println("Printing the contents of LinkedList ");
        System.out.println(linked_list);

        System.out.println("\n Inserting 'Chicago' at index 7...");

        linked_list.add(7 , "Chicago");
        System.out.println("LinkedList after inserting: " +linked_list);
    }
}
