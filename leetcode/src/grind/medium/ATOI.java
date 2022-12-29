package grind.medium;

import java.util.Scanner;

public class ATOI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = getIntegerFromString(sc.nextLine());
		System.out.println("Result : " + result);
		sc.close();
	}

	private static int getIntegerFromString(String s) {
		int marker = 0;long result = 0;
		boolean isNegative = false;
		while (marker < s.length() && s.charAt(marker) == ' ')
			marker++;
		if (marker<s.length() && s.charAt(marker) == '-') {
			isNegative = true;
			marker++;
		} else if (marker<s.length() && s.charAt(marker) == '+')
			marker++;
		while (marker < s.length() && Character.isDigit(s.charAt(marker))) {
			result = result * 10 + s.charAt(marker++) - '0';
			if (result / 10 > Integer.MAX_VALUE || result > Integer.MAX_VALUE) {
				if (isNegative)
					return Integer.MIN_VALUE;
				return Integer.MAX_VALUE;
			}
		}
		if (isNegative)
			return -(int)result;
		else
			return (int)result;
	}

}
