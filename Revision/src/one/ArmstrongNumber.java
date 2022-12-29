package one;

import java.util.Scanner;

public class ArmstrongNumber {

	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt(), cont = 0, temp = num;
		do {
			int d = num % 10;
			cont += d * d * d;
			num /= 10;
		} while (num != 0);
		if (temp == cont)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		{
			System.out.println("Enter the year");
			int year = sc.nextInt();
			System.out
					.println(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "Leap Year" : "Not a Leap year");
		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}
