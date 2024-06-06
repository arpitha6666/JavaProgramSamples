package basicpgms;

import java.util.Scanner;

public class PrimeNumber {
	//2,3,5,7,11,13,17
	//Number >1
	//Which has only two factors: 1 and itself

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		//int num=10;
		int count=0;
		
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i == 0)
					count++;
			}
			if(count==2) {
				System.out.println("Prime number");
			}else {
				System.out.println("not a Prime number");
			}
		}else {
			System.out.println("Number is less than 1! not a prime number");
		}

	}

}
