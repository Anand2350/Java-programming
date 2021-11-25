package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int temp = n;
	int reverseNumber = 0;
	while(temp > 0) {
		int lastdigit = temp % 10;
		reverseNumber = reverseNumber * 10 +lastdigit;
		temp /=10;
		
	}
	if(reverseNumber == n) {
		System.out.println(n +" is palindrome");
	}else {
		System.out.println(n +" is not palindrome");
	}

	}

}
