package fsdrevature;

class Calculator1{

    int a = 10;
    int b = 20;

    public Calculator1(){
        System.out.println("Parameter less constructor");
    }

    public Calculator1(int x, int y){
        this.a = x;
        this.b = y;
    }

    public void addNumbers(){
        System.out.println(a + b);
    }

}

public class Demo20 {
    public static void main(String[] args) {
        Calculator1 cal1 = new Calculator1();
        cal1.addNumbers();

        Calculator1 cal2 = new Calculator1(100, 200);
        cal2.addNumbers();
    }
}
