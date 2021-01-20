package java_threads;

class myThreadClass extends Thread{
    public myThreadClass(String name){
        super(name);
    }

    public void run(){
        System.out.println("Thread : " + this.getName());
    }
}

public class d_thread_priorities {
    public static void main(String[] args) {
        myThreadClass t1 = new myThreadClass("Thread 1");
        myThreadClass t2 = new myThreadClass("Thread 2");
        myThreadClass t3 = new myThreadClass("Thread 3");
        myThreadClass t4 = new myThreadClass("Thread 4");
        myThreadClass t5 = new myThreadClass("Thread 5");
        t2.setPriority(Thread.MAX_PRIORITY); 
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);   
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
