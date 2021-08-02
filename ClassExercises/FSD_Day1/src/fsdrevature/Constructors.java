package fsdrevature;

class Cars {
    public String name;
    public String color;
    public int price;
    public String engineType;

    public Cars() {
        System.out.println("Default Constructor");
    }

    public Cars(String name, String color, int price, String engineType) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }

    public Cars(Cars carObj) {
        this.name = carObj.name;
        this.color = carObj.color;
        this.price = carObj.price;
        this.engineType = carObj.engineType;
    }

    public Cars (Cars carObj, String name) {
        this.name = name;
        this.color = carObj.color;
        this.price = carObj.price;
        this.engineType = carObj.engineType;

    }

    public String toString() {

        return "Car details are: [ " + name + " , " + color + " , " + price + " , " + engineType + "]";
    }

}

public class Constructors {

    public static void main(String[] args) {

        Cars c1 = new Cars();
        System.out.println(c1.toString());
        Cars c2 = new Cars("Audi", "White", 10000, "Petrol");
        System.out.println(c2.toString());
        Cars c3 = new Cars(c2);
        System.out.println(c3.toString());
        Cars c4 = new Cars(c1,"Toyota");
        System.out.println(c4.toString());
    }
}