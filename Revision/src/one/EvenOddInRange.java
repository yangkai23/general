package one;

import java.util.Scanner;

public class EvenOddInRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter lower bound");
		int lowerBound = scanner.nextInt();
		System.out.println("Enter Upper bound");
		int upperBound = scanner.nextInt();
		int sum = (upperBound * (upperBound + 1) / 2) - (lowerBound * (lowerBound + 1) / 2) + 1;
		System.out.println("sum " + sum);
//		System.out.println(Math.pow(upperBound / 2, 2));
		int oddSum = (int) ((Math.pow(upperBound / 2, 2)) - (Math.pow(lowerBound / 2, 2)));
//		System.err.println(oddSum);
		System.out.println("Even numbers sum = " + (sum - oddSum));
		System.out.println("Odd numbers sum = " + oddSum);
		scanner.close();
	}
}
