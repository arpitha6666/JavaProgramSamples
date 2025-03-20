package ThreadPgms;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread class implementation");
        for(int i =0;i<100;i++){
            System.out.println("BINGO");
        }
    }

}
