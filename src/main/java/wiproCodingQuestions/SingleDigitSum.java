package wiproCodingQuestions;

public class SingleDigitSum {
    public static int findFinalSum(int[] arr) {
        int totalSum=0;
        for(int i : arr){
            totalSum+=i;
        }
        return getSingleDigit( totalSum);
    }
    public static int getSingleDigit(int num) {

        while(num>=10){
            int sum=0;
            while(num>0){
                sum=sum+num%10;
                num= num/10;
            }
            num=sum;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6,10};

        System.out.println(findFinalSum(arr));
    }
}
