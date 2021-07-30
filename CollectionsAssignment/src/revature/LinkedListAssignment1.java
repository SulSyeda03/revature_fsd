package revature;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment1 {
    //1. Write a Java program to append the specified element to the end of a linked list.
    public static void main(String[] args) {

        System.out.println("\n**********");
        System.out.println("\n ******Java program to append the specified element to the end of a linked list.******");

        LinkedList<String> linked_list = new LinkedList<>();
        System.out.println("\nLinkedList before adding elements : " + linked_list);
        System.out.println("\nAdding elements to LinkedList...");
        linked_list.add("New York");
        linked_list.add("Chicago");
        linked_list.add("California");
        linked_list.add("Washington");
        //linked_list.add("New York");


        System.out.println("Printing the contents of LinkedList ");
        System.out.println(linked_list);
    }
}
