package ThreadPgms;

public class AddThread extends Thread{
    int result,sum;
    int[] arr;
    public AddThread(int[] arr){
        this.arr=arr;
    }

    @Override
    public void run(){
        for(int i:arr){
            sum=sum+i;
            result = sum;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[]{1,2,3,4,5};
        AddThread t = new AddThread(arr);
        t.start();
        t.join();//with t.join() o/p is zero
        System.out.println(t.result);
    }
}
