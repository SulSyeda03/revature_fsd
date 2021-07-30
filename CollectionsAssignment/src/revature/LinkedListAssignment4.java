package revature;

import java.util.LinkedList;

public class LinkedListAssignment4 {
    //4. Write a Java program to iterate a linked list in reverse order.
    public static void main(String[] args) {

        System.out.println("\n**********");
        System.out.println("\n ******Java program to iterate a linked list in reverse order.******");

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

        System.out.println("\nIterating a linked list in reverse order. ");

        for (int i = linked_list.size()-1 ; i >=0; i-- ) {
            System.out.println(linked_list.get(i));
        }
    }
}