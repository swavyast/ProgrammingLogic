package com.ml.numbers;

import java.util.Scanner;

public class ReverseNumberProblems {

	private static int reverseMyNumber(int n) {
		int reverse = 0;
		while (n != 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}
		return reverse;
	}

	private static String isPalindrome(int n) {
		String msg = null;
		if (reverseMyNumber(n) == n) {
			msg = n + " is a palindrome number";
		} else {
			msg = n + " is not a palindrome number";
		}

		return msg;
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = 0;
			rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		return sum;
	}
	
	public static int sumOfEvenDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = 0;
			rem = n % 10;
			if(rem%2==0) {
				sum += rem;
			}
			n = n / 10;
		}
		return sum;
	}
	
	public static int sumOfOddDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = 0;
			rem = n % 10;
			if(rem%2>0) {
				sum += rem;
			}
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number\n");
		int n = sc.nextInt();
//		int reverse = ReverseNumberProblems.reverseMyNumber(n);
//		System.out.println("Reverse of number "+n+" is : "+reverse);
//		String msg = ReverseNumberProblems.isPalindrome(n);
//		System.out.println(msg);
		int sum = ReverseNumberProblems.sumOfEvenDigits(n);
		System.out.println(sum);
	}

}
