package fsdrevature;

public class TernaryOperator {
    public static void main(String[] args) {

        int age = 18;

        String result = age > 18 ? "Eligible" : "Not Eligible";
        System.out.println(result);

        int i =10;
        String output = ( i % 2 == 0) ? "i = " +i+ " is Even" : "i = " +i+ " is Odd" ;
        System.out.println(output);
    }
}
