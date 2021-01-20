package java_oops;

class base{
    int x = 10;
    int y = 20;
}

class derived extends base{
    void printBase()
    {
        System.out.println(x);
        System.out.println(y);
    }
}

public class e_inheritance {
    public static void main(String[] args) {
        derived obj = new derived();
        obj.printBase();
    }
}
