package fsdrevature;

class Calculator{

    int a = 10;
    int b = 20;

    public Calculator(){
        System.out.println("Parameter less constructor");
    }

    public Calculator(int x, int y){
        this.a = x;
        this.b = y;
    }

    public void addNumbers(){
        System.out.println(a + b);
    }

}

public class Main {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.addNumbers();

        Calculator cal2 = new Calculator(100, 200);
        cal2.addNumbers();
    }
}