package basicpgms;

public class HCFWithoutUsingRecurrsion {

    public static void main(String[] args){
        int m =15;
        int n =70;

        while(m!=n){
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        System.out.println("HCF is : "+m);
    }
}
