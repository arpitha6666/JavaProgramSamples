package ThreadPgms;

public class MyThreadRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable implementation");
        for(int i =0;i<100;i++){
            System.out.println("BONGO");
        }
    }
}
