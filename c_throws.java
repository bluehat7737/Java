class NegativeRadiusException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = -6046626251687282388L;

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Radius Can Not Be Negative!";
    }
}

public class c_throws {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 2;  
        int b = 0;
        try {
            int c = divide(a, b);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        try {
            double d = area(-6);
            System.out.println(d);
        } catch (NegativeRadiusException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
}
