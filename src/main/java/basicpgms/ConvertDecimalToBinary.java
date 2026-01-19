package basicpgms;

public class ConvertDecimalToBinary {

    public static void main(String[] args){
        int decimalNum = 15;
        StringBuffer sb = new StringBuffer();

        while(decimalNum!=0){
            int rem = decimalNum%2;
            sb.insert(0,rem);
            decimalNum=decimalNum/2;

        }
        System.out.println(sb);

    }
}
