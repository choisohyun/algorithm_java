package algorithm;

import java.util.Scanner;

public class BOJ11653 {
	static int i = 2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		StringBuilder sb = new StringBuilder();
		
		System.out.println(getFactorization(n, sb));
	}

	public static String getFactorization(int n, StringBuilder sb) {
		if (n == 1) return (sb.toString());
		
		if (n % i == 0) {
			n /= i;
			sb.append(i + "\n");
		}
		else {
			i++;
		}
		
		return getFactorization(n, sb);
	}

}
