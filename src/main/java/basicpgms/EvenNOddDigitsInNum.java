package basicpgms;

import java.util.Scanner;

public class EvenNOddDigitsInNum {

	//145678
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int org_num = num;
		int even=0, odd=0;
		while(num!=0) {
			int dig =num%10;
			if(dig%2==0)
				even++;
			else
				odd++;
			num=num/10;
		}
		System.out.println("Even count of digits in number "+org_num+" is "+even);
		System.out.println("Odd count of digits in number "+org_num+" is "+odd);

	}

}
