package grind.medium;


	import java.util.Scanner;

	public class LongestSubstr2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			String len = getLongSubstrLength(s);
			System.out.println(len);
			sc.close();
		}

		public static String getLongSubstrLength(String s) {
			int start = 0, end = 0;
			for (int i = 0; i < s.length(); i++) {
				int left = i;
				int right = i,k=i;
				while(k<s.length()-1 && s.charAt(k)==s.charAt(k+1)) {
					k++;
				}
				right=k;
					
				while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
					System.out.println("right " + right + " left " + left);
					left--;
					right++;
				}
				left += 1;
				if ((end - start) < (right - left)) {
					System.out.println(s.substring(start, end));
					start = left;
					end = right;
				}
			}
			return s.substring(start, end);
		}
	}

