package Xams;

import java.util.Scanner;

public class DhathriXam1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int plots[]=new int[n];
	int cost[]=new int[n];
	for(int i=0;i<plots.length;i++) {
		plots[i]=sc.nextInt();
	}
	for(int i=0;i<cost.length;i++) {
		cost[i]=sc.nextInt();
	}
	solution(n,plots,cost);
	sc.close();
}

 static void solution(int n, int[] plots, int[] costs_arr) {
	 int cost=0;
	 
	for(int i=0;i<plots.length-1;i=i+2) {
		System.out.println(cost);
		cost=cost+cost+plots[i]+plots[i+1];
	}
//	System.out.println(cost);
}
}
