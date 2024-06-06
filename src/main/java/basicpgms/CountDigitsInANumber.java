package basicpgms;

import java.util.Scanner;

public class CountDigitsInANumber {

	//45789
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int org_num= num;
		
		int count =0;
		while(num!=0) {
			num=num/10;//1 run num = 4578
			count++;
		}
		System.out.println("Number of digits in given number "+ org_num +" is "+ count);
	}

}
