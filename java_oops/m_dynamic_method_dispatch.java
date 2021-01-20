package java_oops;

class Super{
    public void meth1(){
        System.out.println("Meth 1");
    }
}

class Sub extends Super{
    public void meth2(){
        System.out.println("Meth 2");
    }
}

public class m_dynamic_method_dispatch {
    public static void main(String[] args) {
        Super s = new Sub(); // Allowed
        // Sub s = new Super(); // Not-Allowed
        // s.meth2(); // Not-Allowed
        s.meth1(); // Allowed
    }
}
