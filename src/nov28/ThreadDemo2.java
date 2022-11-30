//threading demo with thread class
package nov28;

public class ThreadDemo2 extends Thread{
    @Override
    public void run(){
        for(int a = 100;a<=200;a++){
            System.out.println(a);
        }
    }
}
