package java_practice;

import java.util.Scanner;

public class l_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] marks = new int[5];

        System.out.println("Enter 5 values : ");
        int total = 0;
        for(int i=0; i<5; i++){
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        System.out.print("Total : " + total);
        sc.close();
    }
}
