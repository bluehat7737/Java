package java_oops;

class a{
    void demo(){
        System.out.println("Class A");
    }
}

class b extends a{
    @Override
    void demo(){
        System.out.println("Class B");
    }
}
public class i_method_overriding {
    public static void main(String[] args) {
        b obj = new b();
        obj.demo();
        
    }
}
