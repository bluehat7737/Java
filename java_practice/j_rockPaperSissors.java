package java_practice;

import java.util.Random;
import java.util.Scanner;

public class j_rockPaperSissors {
    public static void main(String[] args) {
        Random rand = new Random();
        int pc = rand.nextInt(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice : ");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Sissors");

        System.out.println("PC Choose :: " + pc);

        int user = sc.nextInt();

        if(user==0 && pc==2){
            System.out.println("PC choose Sissors :: You Win!");
        }
        else if(user==1 && pc==0){
            System.out.println("PC choose Rock :: You Win!");
        }
        else if(user==2 && pc==1){
            System.out.println("PC choose Paper :: You Win!");
        }
        else{
            System.out.println("You Loose!");
        }

        sc.close();
    }
}
