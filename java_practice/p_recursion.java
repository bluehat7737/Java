package java_practice;


public class p_recursion {
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fabo(int n) {
        // if(n == 1)
        // {
        // return 0;
        // }
        // else if( n == 2){
        // return 1;
        // }
        if (n <= 2) {
            return n - 1;
        } else {
            return fabo(n - 1) + fabo(n - 2);
        }
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    static void printSpace(int n){
        if(n==0)
            return;
        System.out.print(" ");
        printSpace(n-1);
    }

    static void printAstrisk(int n){
        if(n==0)
            return;
        System.out.print("* ");
        printAstrisk(n-1);
    }

    static void pattern(int n, int num) {
        if(n==0)
            return;
        printSpace(n-1);
        printAstrisk(num-n+1);
        System.out.println("");

        pattern(n-1, num);
    }

    public static void main(String[] args) {
        // System.out.println(factorial(5));
        // System.out.println(fabo(5));
        // System.out.println(sum(4));
        pattern(5, 5);
    }
}
