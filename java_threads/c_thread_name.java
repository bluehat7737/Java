package java_threads;

class myClass extends Thread{
    public myClass(String name){
        super(name);
    }
}

public class c_thread_name {
    public static void main(String[] args) {
        myClass m = new myClass("Anshul");
        System.out.println("New Thread Name is : " + m.getName());
        System.out.println("New Thread ID is : " + m.getId());
    }
}
