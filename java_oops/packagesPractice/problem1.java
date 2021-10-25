package java_oops.packagesPractice;
// un comment this line 3 and comment line 1
// package calc;

class Calsulator{
    public void calculate(int a, int b){
        System.out.println("Result : "+ (a+b));
    }
}

class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("Result : "+ Math.sin(a+b));
    }
}
class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("Result : "+ (a+b));
        System.out.println("Result : "+ Math.sin(a+b));
    }
}

public class problem1{
    public static void main(String[] args) {
        System.out.println("problem1");
    }
}