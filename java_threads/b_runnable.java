package java_threads;

class MyRunnableThread1 implements Runnable{
    public void run(){
        int i =0;
        while(i<10){
            System.out.println("I am Thread 1");
            i++;
        }
    }
}

class MyRunnableThread2 implements Runnable{
    public void run(){
        int i =0;
        while(i<10){
            System.out.println("I am Thread 2");
            i++;
        }
    }
}

public class b_runnable {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        System.out.println("Name : " + gun1.getName());
        gun2.start();

    }
}
