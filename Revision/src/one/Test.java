package one;

public class Test {
	static int a;

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1)
				continue;
			if (i == 10)
				break;
			System.out.print(i + ",");
		}
	}
}
