package basicpgms;

public class CheckBreakInsideIf {
    public static void main(String[] args){
        int a =0;
        if(a<1){
            a++;
           // break;
        }
        int c=0;
        while(c<10){
            if(c==5){
                break;
            }
            c++;
            System.out.println(c);
        }
    }
}
