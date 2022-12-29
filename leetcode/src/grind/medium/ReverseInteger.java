package grind.medium;

import java.util.Scanner;

public class ReverseInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int res = getReversedNumber(sc.nextLong());
//		System.out.println(res);
		sc.close();
	}

	private static int getReversedNumber(int x) {
		StringBuilder builder = new StringBuilder();
		boolean check = false;
		if (x < 0) {
			builder.append(x * -1);
			check = true;
		} else
			builder.append(x);
		builder.reverse();

		long rev = Long.parseLong(builder.toString());
System.out.println(rev);
		if (check)
			rev = rev * -1;
		if (rev > Integer.MAX_VALUE)
			return 0;

		if (rev < Integer.MIN_VALUE)
			return 0;
		else
			return (int) rev;
	}
}
