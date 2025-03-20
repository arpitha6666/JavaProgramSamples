package ThreadPgms;

public class TestMyThread{
    public static void main(String[] args){
        MyThread t1 =new MyThread();
        t1.start();
        System.out.println("*****************");
        MyThreadRunnable tr = new MyThreadRunnable();
        Thread t2 = new Thread(tr);
        t2.start();
   }
}
