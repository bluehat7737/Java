package java_oops;

interface parentSampleInterface{
    void meth1();
}

interface childSampleInterface extends parentSampleInterface{
    void meth2();
}

class sampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }

}

public class l_interface_inheritance {
    public static void main(String[] args) {
        sampleClass sc = new sampleClass();
        sc.meth1();
        sc.meth2();
    }
}
