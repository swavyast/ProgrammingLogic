package com.ml.numbers;

import java.util.Optional;
import java.util.Scanner;

public class ArmstrongNumber {
	
	private static boolean checkifArmstrong(long l) {
		long num = l;
		int count = 0;
		byte digit = 0;
		double sum = 0;
		while(num!=0) {
			num/=10;
			count++;
		}
		num = l;
		while(num!=0) {
			digit=(byte) (num%10);
			sum+=Math.pow(digit, count);
			num/=10;
		}
		return (sum == l);
	}
	
	
	private static Long validInputCheck(Scanner sc) {
		
		while(true) {
			try {
				long input = sc.nextLong();
				if(input<=Long.MAX_VALUE) {
					
					return input;
				}else {
					System.out.println("Enter a valid input in range of long data-type");
				}
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a valid long integer.");
				sc.next();
			}
		}
		
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//System.out.println("Enter your number");
//		Optional<Long> op = Optional.ofNullable(ArmstrongNumber.validInputCheck(sc));
//		long num = op.orElse(0L);
		long a[]= {4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050, 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774L};
		for(long i:a) {
			boolean b = checkifArmstrong(i);
			if(b)
				System.out.println(i+ " is an Armatrong Number");
			else
				System.out.println(i + " is not Armstrong");
		}
	}

}
