package java_practice;

class StaticVar{
    // this is instance variable (inside a class (outside any method))
    // int a = 10;

    // this is static variable (inside a class (outside any method))
    public static int salary = 100000;
    public static String name = "Anshul";

    // this is final variable
    final int i;
    public StaticVar(int x){
        this.i = x ;
    }
}

public class a_variables {
    public static void main(String[] args) {
        // this is how final var is initialize
        StaticVar sv = new StaticVar(1);
        System.out.println(sv.i);

        // this is local variable (inside a method) (initialization is mandatory)
        // int i = 10;
        System.out.println("Name : " + StaticVar.name);
        System.out.println("Salary : " + StaticVar.salary);
    }
}
