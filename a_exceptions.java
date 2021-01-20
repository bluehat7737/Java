import java.util.Scanner;

public class a_exceptions {
    public static void main(String[] args) {
        int []arr = new int[3];
        arr[0] = 4;
        arr[1] = 56;
        arr[2] = 7;

        System.out.print("At Index > ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.print("Diveded By > ");
        int div = sc.nextInt();

        try{
            System.out.println("Value at Index > " + arr[index]);
            System.out.println("Result > " + (arr[index] / div));
        }
        catch(ArithmeticException ae){
            System.out.println("Airthmatic Exception!");
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("Wrong Index! Entered");
        }
        catch(Exception e){
            System.out.println("Some Other Exception > ");
            System.out.print(e);
        }
        sc.close();
    }
}
