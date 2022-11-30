package nov29;

public class ThreadPriDemo extends Thread{
    public ThreadPriDemo(String a){
        super(a);
    }
    @Override
    public void run(){
        System.out.println("Priority of the thread is :"+Thread.currentThread().getPriority());
    }
}
