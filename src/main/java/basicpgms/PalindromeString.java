package basicpgms;

import java.util.Scanner;

public class PalindromeString {
	//MADAM

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str= sc.next();
		
		String rev_str = "";
		String org_str= str;
		
		for(int i=str.length()-1;i>=0;i--) {
			rev_str = rev_str+str.charAt(i);
		}
		System.out.println(rev_str);
		if(org_str.equals(rev_str))
			System.out.println(org_str + " is a palindrome");
		else
			System.out.println(org_str + " is not a palindrome");
	}

}
