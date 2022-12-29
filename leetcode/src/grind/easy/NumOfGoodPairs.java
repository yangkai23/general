package grind.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NumOfGoodPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[sc.nextInt()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int pairs = getNumOfPairs(ar);
		System.out.println(pairs);
		sc.close();
	}
	public static int getNumOfPairs(int[] nums) {
		int count = 0;
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.get(nums[i]).add(i);
				if(map.get(nums[i]).size()>1)
				count += map.get(nums[i]).size() - 1;
			} else {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				map.put(nums[i], list);
			}
		}
		return count;
	}
}
