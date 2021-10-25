package java_oops;

abstract class Parent{
    public Parent(){
        System.out.println("I am Parent class constructor.");
    }

    abstract void greet();
    // abstract void greet1();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning!");
    }
}

public class h_abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
