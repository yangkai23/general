package grind.easy;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(isPalindrome(sc.nextInt()));
		sc.close();
	}
	 public static boolean isPalindrome(int x) {
	        int result=0,original=x;
	        boolean isNegative=false;
	        if(x<0)
	            isNegative=true;
	        do{
	        	int d=x%10;
	            result=result*10+d;
	            x/=10;
	        }while(x!=0);
	        if(result==original && !isNegative)
	            return true;
	        else
	            return false;
	    }
}
