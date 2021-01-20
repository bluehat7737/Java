package java_oops;

class base1 {
    base1() {
        System.out.println("I am base class constructor.");
    }
    base1(int x) {
        System.out.println("I am base class constructor with value x: "+x);
    }
}

class derived1 extends base1 {
    derived1() {
        // super();
        System.out.println("I am derived class constructor.");
    }
    derived1(int x, int y) {
        super(x);
        System.out.println("I am derived class constructor with value y: "+y);
    }
    
}

class childOfDerived extends derived1{
    childOfDerived(){
        System.out.println("I am child of derived class constructor.");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am child of derived class constructor with value z: "+z);
    }
}

public class f_constructor_overloading {
    public static void main(String[] args) {
        // childOfDerived cd = new childOfDerived(1,2,3);
    }
}
