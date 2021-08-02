package fsdrevature;

import java.util.Scanner;

class Book3 {
    private String title;
    private String author;
    private int price;

    public Book3(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Book: Title=" + title + ", Author=" + author + ", Price=" + price);
    }
}

public class ParameterizedConstructor  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Title");
        String s1 = sc.nextLine();
        System.out.println("Enter Author");
        String s2 = sc.nextLine();
        System.out.println("Enter Price");
        int p = sc.nextInt();
        Book3 obj = new Book3(s1,s2,p);
        obj.printInfo();
    }
}
