package java_practice;

import java.util.Scanner;

public class i_incomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Salary : ");
        int salary = sc.nextInt();

        if (salary <= 250000 && salary >= 500000) {
            int tax = ((salary/100) * 5);
            System.out.println("Your payable tax is " + tax);
        } else if (salary >= 500000 && salary <= 1000000) {
            int tax = ((salary/100)*20);
            System.out.println("Your payable tax is " + tax);
        } else {
            int tax = ((salary/100) * 30);
            System.out.println("Your payable tax is " + tax);
        }
        sc.close();
    }
}
