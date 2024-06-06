package basicpgms;

import java.util.Scanner;

public class PalindromeNumber {
	// 16461

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int org_num = num;

		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		// System.out.println(rev);
		if (org_num == rev)
			System.out.println(org_num + " Palindrome number ");
		else
			System.out.println(org_num + " is not a Palindrome number ");

	}

}
