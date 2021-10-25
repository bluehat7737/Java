package java_practice;

// import java.util.Scanner;

public class g_strings {
    public static void main(String[] args) {
        // String name = new String("Anshul");
        // same as
        // String name = "Anshul";
        // System.out.print("The name is: ");
        // System.out.print(name);

        // int i = 1;
        // float f = 1.0f;
        // System.out.printf("The value of a is %d and f is %f.", i, f);

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(str);
        // sc.close();

        // strings are immutable in java

        String str = "Anshul   ";
        String lower = str.toLowerCase();
        String upper = str.toUpperCase();
        int len = str.length();
        String trim = str.trim();
        System.out.println(lower);
        System.out.println(upper);
        System.out.println(len);
        System.out.println(trim);
        System.out.println(str.substring(2,4));
        System.out.println(str.replace(" ", "_"));
        System.out.println(str.startsWith("An"));
        System.out.println(str.endsWith("ul"));
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("sh"));
        System.out.println(str.lastIndexOf("sh"));
        System.out.println(str.equals("Anshul"));
        System.out.println(str.equalsIgnoreCase("ansHUL"));
    }
}
