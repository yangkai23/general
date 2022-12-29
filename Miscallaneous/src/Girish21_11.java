import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Girish21_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ar[] = new int[scanner.nextInt()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = scanner.nextInt();
		}
		System.out.println(removeDuplicates(ar));
		scanner.close();
	}

	private static ArrayList<Integer> removeDuplicates(int[] ar) {
		// Remove Duplicates using stream api
		ArrayList<Integer> list2 = new ArrayList<>();
		Arrays.stream(ar).distinct().boxed().toList().forEach(i -> list2.add(i));
		return list2;
	}

}