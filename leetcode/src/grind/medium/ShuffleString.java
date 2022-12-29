package grind.medium;

import java.util.Scanner;
import java.util.TreeMap;

public class ShuffleString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		String str = sc.next();
		String s = getTransformedString(str, ar);
		System.out.println(s);
		sc.close();
	}

	private static String getTransformedString(String str, int ar[]) {
		String st = "";
		TreeMap<Integer, Character> transfromedString = new TreeMap<>();
		int k = 0;
		while (k < ar.length && k < str.length()) {
			transfromedString.put(ar[k], str.charAt(k));
			k++;
		}
		for (int i = 0; i < str.length(); i++) {
			st = st + transfromedString.get(i);
		}
		return st;
	}
}
