package java_practice;

import java.util.Scanner;

public class k_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit : ");
        int n = sc.nextInt();

        // for(int i=n; i>0; i--){
        // for(int j=i; j>0; j--){
        // System.out.print("* ");
        // }
        // System.out.print("\n");
        // }

        int l = n;
        for (int i = 0; i < n; i++) {
            for (int j = l; j > 0; j--) {
                System.out.print(" ");
            }
            l--;
            for(int k=-1; k<i; k++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}
