package algorithm;

import java.util.Scanner;

public class BOJ9461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			System.out.println(padovan(n));
		}
		sc.close();
	}

	public static long padovan(int n) {
		long[] sequence = new long[n+1];
		
		for (int i = 1; i <= n; i++) {
			sequence[i] = (i < 4)? 1 : sequence[i-2]+sequence[i-3];
		}
		
		return sequence[n];
	}

}
