import nov28.ThreadDemo;
import nov28.ThreadDemo2;
import nov29.*;
import java.io.*;
import dec2.*;
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
//        ThreadPriDemo n1 = new ThreadPriDemo("t1");
//        ThreadPriDemo n2 = new ThreadPriDemo("t2");
//        ThreadPriDemo n3 = new ThreadPriDemo("t3");
//        ThreadPriDemo n4 = new ThreadPriDemo("t4");
//        ThreadPriDemo n5 = new ThreadPriDemo("t5");
//        n1.setPriority(Thread.MIN_PRIORITY);
//        n2.setPriority(Thread.MAX_PRIORITY);
//        n5.setPriority(Thread.NORM_PRIORITY);
//        n1.start();
//        n2.start();
//        n3.start();
//        n4.start();
//        n5.start();
        //dec 2 file io
        String FilePath = "/home/anil/Pictures/ei.png";
        String SrcFilePath = "/home/anil/Pictures/new.png";
        try{
            FileInputStream input = new FileInputStream(FilePath);
            FileOutputStream output = new FileOutputStream(SrcFilePath);
            int databyte = 0;
            while ((databyte=input.read())!=-1) {
                output.write(databyte);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO EXCEPTION");
        }

    }
}