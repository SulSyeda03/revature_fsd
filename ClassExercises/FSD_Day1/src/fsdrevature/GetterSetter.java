package fsdrevature;

class Book1 {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Book Title: " + title + " \nBook Author: " + author + "\nBook " +
                "Price: " + price);
    }


}

public class GetterSetter {

    public static void main(String[] args) {

        Book1 b1 = new Book1();
        b1.setTitle("JAVA for Beginners");
        b1.setAuthor("ABC");
        b1.setPrice(23.56);
        System.out.println(b1.getPrice());

        b1.printInfo();
    }
}
