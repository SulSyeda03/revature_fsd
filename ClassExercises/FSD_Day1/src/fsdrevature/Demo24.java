package fsdrevature;

class Parent {

    public Parent() {
        System.out.println("Parent Constructor...");
    }

}

class Child extends Parent {

    public Child() {
        System.out.println("Child Constructor...");
    }

}


public class Demo24 {

    public static void main(String[] args) {

        //Creating child obj
        System.out.println("Creating child obj ");
        Child c = new Child();
        System.out.println("***");
        System.out.println("Creating Parent Obj ");
        Parent p = new Parent();
        //System.out.println("***");
        //System.out.println("Casting objects: Child c1 = (Child) new Parent();");
        //Child c1 = (Child) new Parent();
        System.out.println("***");
        System.out.println("Casting objects: Parent p1 = new Child();");
        Parent child = new Child();





    }
}
