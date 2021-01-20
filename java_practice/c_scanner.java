package java_practice;

import java.util.Scanner;

public class c_scanner {
    public static void main(String[] args) {
        System.out.println("Taking user's input : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value : ");
        // int x = sc.nextInt();
        // float a = sc.nextFloat();
        // System.out.print("Enter anather value : ");
        // int y = sc.nextInt();
        // float b = sc.nextFloat();
        // System.out.println("Sum of number 1 and number 2 is " + (a+b));

        // boolean b = sc.hasNextInt();
        // System.out.println(b);
        
        String str = sc.nextLine();
        System.out.println(str);

        sc.close();
    }
}
