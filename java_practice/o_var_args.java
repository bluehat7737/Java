package java_practice;

public class o_var_args {
    // ...arr creates an array of all upComming integers
    static int sum(int ...arr)
    {
        int result = 0;
        for( int i : arr)
        {
            result += i;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum());
    }
}
