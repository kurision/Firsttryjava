import nov28.ThreadDemo;
import nov28.ThreadDemo2;
import nov29.*;
public class Main {
    public static void main(String[] args) {
//        Runnable th = new ThreadDemo();
//        Thread t1 = new Thread(th);
//        t1.start();
//        ThreadDemo2 t2= new ThreadDemo2();
//        t2.start();
//        for(int i=10;i<=15;i++){
//            System.out.println("Main thread is running");
//            System.out.println(i);
//        }
        ThreadPriDemo n1 = new ThreadPriDemo("t1");
        ThreadPriDemo n2 = new ThreadPriDemo("t2");
        ThreadPriDemo n3 = new ThreadPriDemo("t3");
        ThreadPriDemo n4 = new ThreadPriDemo("t4");
        ThreadPriDemo n5 = new ThreadPriDemo("t5");
        n1.setPriority(Thread.MIN_PRIORITY);
        n2.setPriority(Thread.MAX_PRIORITY);
        n5.setPriority(Thread.NORM_PRIORITY);
        n1.start();
        n2.start();
        n3.start();
        n4.start();
        n5.start();
    }
}