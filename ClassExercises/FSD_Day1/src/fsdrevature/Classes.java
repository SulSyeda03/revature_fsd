package fsdrevature;

    class Book {
        public String title;
        public String author;
        public double price;

        void printInfo() {
            System.out.println("Book Title: " + title + " \nBook Author: " + author + "\nBook " +
                    "Price: " + price);
        }
    }

    public class Classes {

        public static void main(String[] args) {

            Book b1 = new Book();
            b1.title = "Java For Beginners";
            b1.author = "XYS" ;
            b1.price = 23.45;

            b1.printInfo();
        }
    }