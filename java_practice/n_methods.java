package java_practice;

public class n_methods {

    int nonStaticSum(int a, int b)
    {
        return a + b;
    }
    static int sum(int a, int b)
    {
        return a + b;
    }

    static void greet()
    {
        System.out.println("Good Morning!");
    }

    // here "str" is a parameter. 
    static void greet(String str)
    {
        System.out.println("Good Morning "+ str);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = sum(a,b);
        // ststic calling
        System.out.println(c);
        
        // non static calling
        n_methods obj = new n_methods();
        c = obj.nonStaticSum(a, b); 
        System.out.println(c);

        // method overloading
        greet();
        // here "Anshul" is a argument
        greet("Anshul");
    }
}
