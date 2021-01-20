class MyException extends Exception{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return "My toString()";
    }

    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "My getMessege()";
    }
}

public class b_exceptionClass {
    public static void main(String[] args) {
        int a = 10;
        if(a<99){
            try{
                // throw new ArithmeticException("AIR");
                throw new MyException();
            }    
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
