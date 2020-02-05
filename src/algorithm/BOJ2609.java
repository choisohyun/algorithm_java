package algorithm;

import java.util.Scanner;

public class BOJ2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		sc.close();
		
		int big = Math.max(first, second);
		int small = Math.min(first, second);
		
		System.out.println(gcd(big, small));
		System.out.println((first * second) / gcd(big, small));		
	}

	public static long gcd(int first, int second) {
		if (second <= 0) return first;
		
		int temp = first;
		first = second;
		second = temp % second;
		
		return gcd(first, second);
	}

}
