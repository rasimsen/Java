package com.oasissofttech.corejava;

import java.util.Scanner;

public class FibonacciCalculator {
	public static void main(String args[]) {
		System.out.println("Enter number upto which Fibonacci series to print: ");
		int fibonacciNumber = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series upto " + fibonacciNumber + " numbers : ");

		for (int i = 1; i <= fibonacciNumber; i++) {
			System.out.print(fibonacci2(i) + " ");
		}
	}

	public static int fibonacci2(int fibonacciNumber) {
		if (fibonacciNumber == 1 || fibonacciNumber == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= fibonacciNumber; i++) {
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
		}
		return fibonacci;
	}

}
