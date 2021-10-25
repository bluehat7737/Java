package java_practice;

public class h_practiceSet {
    public static void main(String[] args) {
        String str = "Hello, My  name is   Anshul";
        
        int i = str.indexOf("   ");
        System.out.println(i);
        if(i!=-1){
            str= str.replace("   ", " ");
            System.out.println(str);
        }

        i = str.indexOf("  ");
        if(i!=-1){
            str= str.replace("  ", " ");
            System.out.println(str);
        }
    }
}
