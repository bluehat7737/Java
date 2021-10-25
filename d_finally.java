public class d_finally {
    public static int greet(){
        try{
            System.out.println("Good Morning");
            return 1;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Cleaning Up Resources!");
        }
        return 0;
    }
    public static void main(String[] args) {
        int i = greet();
        System.out.println(i);
    }
}
