//threading with using Runnable
package nov28;

public class ThreadDemo implements Runnable{
    @Override
    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running");
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.print("Exception "+e);

        }
    }
}
