package com.ml.numbers;

public class PrimeNumberProblems {
	
	//Check if n is prime or not
	private static boolean ifPrime(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return (count==2)?true:false;
	}
	
	//count prime numbers in an array
	private static int countPrime(int [] array) {
		int primeCount = 0;
		for(int i : array) {
			if(ifPrime(i)) {
				primeCount++;
			}
		}
		return primeCount;
	}
	//add prime numbers from an array
	private static int addPrimes(int [] array) {
		int sum = 0;
		for(int i : array) {
			if(ifPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}
	
	//sum of prime numbers in a given range
	private static int sumOfPrimeInRange(int start, int end) {
		int sum = 0;
		for(int i = start; i<=end; i++) {
			if(ifPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}
	
	//remove prime numbers from an array
	
	private static int[] removePrimeFromAnArray(int [] array) {
		int [] result = new int [array.length];
		int k = 0;
		for(int i : array) {
			if(!ifPrime(i)) {
				result[k] = i;
				k++;
			}
		}
		return result;
	}
	
	//sum of non-prime numbers in an array
	private static int sumOfNonPrimeNumbers(int [] arr) {
		int sum = 0;
		for(int i : arr) {
			if(!ifPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}
	
	//count prime and non-prime numbers in a given range
	private static int[] countOfPrimeAndNonPrimeNumbers(int start, int end) {
		int count [] = new int [2];
		for(int i = start; i<=end; i++) {
			if(ifPrime(i)) {
				count[0]++;
			}else {
				count[1]++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(ifPrime(15));
		int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(countPrime(a));
		System.out.println(addPrimes(a));
		System.out.println(sumOfPrimeInRange(1, 20));
		for(int i : removePrimeFromAnArray(a))
			System.out.print(i + "  ");
		System.out.println("\n"+sumOfNonPrimeNumbers(a));
		for(int i : countOfPrimeAndNonPrimeNumbers(1, 10))
			System.out.println(i);
	}

}
