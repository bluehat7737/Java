package java_oops;

import java.util.Random;
import java.util.Scanner;

class game {
    private Random ran = new Random();
    private Scanner sc = new Scanner(System.in);

    public void start(int chances) {
        int pc = ran.nextInt(100);
        System.out.println("PC :: "+pc);
        System.out.println("PC is Ready ->");
        while (chances > 0) {
            System.out.println("Chance Left : " + chances);
            System.out.print("PLAY NOW :: > ");
            int user = sc.nextInt();

            if (user == pc) {
                System.out.println("PC :: " + pc);
                System.out.println("You Win!");
                break;
            } else if (user < pc) {
                System.out.println("Guess Bigger :");
            } else if (user > pc) {
                System.out.println("Guess Smaller :");
            }
            if (chances == 1) {
                System.out.println("You Loose!");
                break;
            }
            chances--;
        }
    }
}

public class d_guessTheNumber {
    public static void main(String[] args) {
        game player = new game();
        player.start(2);
    }
}
