package java_practice;

import java.util.Scanner;

public class d_exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks of 5 subject's.");
        System.out.print("Subject 1 : ");
        int a = sc.nextInt();
        System.out.print("Subject 2 : ");
        int b = sc.nextInt();
        System.out.print("Subject 3 : ");
        int c = sc.nextInt();
        System.out.print("Subject 4 : ");
        int d = sc.nextInt();
        System.out.print("Subject 5 : ");
        int e = sc.nextInt();

        float sum = a+b+c+d+e;
        float perc = (sum/600)*100;
        System.out.println("Percentage : " + perc);
        sc.close();
    }
}
