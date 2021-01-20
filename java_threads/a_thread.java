package java_threads;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50)
        {
            System.out.println("This is class MyThread 1");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50)
        {
            System.out.println("This is class MyThread 2");
            i++;
        }
    }
}

public class a_thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }  
}
