package one;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lb = scanner.nextInt();
		int ub = scanner.nextInt();
		int evensum = 0, oddsum = 0;
		while (lb <= ub) {
			if (lb % 2 == 0)
				evensum += lb;
			else
				oddsum += lb;
			lb++;
		}
		System.out.println("evenSum :  "+evensum + "\n" + "oddSum :  "+oddsum);
		scanner.close();
	}
}
