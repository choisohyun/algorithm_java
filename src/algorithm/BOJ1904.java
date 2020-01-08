package algorithm;

import java.util.Scanner;

public class BOJ1904 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.print(binary(n));
	}

	/**
	 * n = 1	1
	 * n = 2	2
	 * n = 3	3	001 100 111
	 * n = 4	5	0011, 0000, 1001, 1100, 1111
	 * n = 5	8	00111, 10011, 11100, 11001, 00001, 00100, 10000, 11111
	 * n = 6	13
	 * n = 7	21
	 * n = 8	34
	 * n = 9	55
	 * n = 10	89
	 * 11		144
	 * 12		233
	 * 13		377
	 * 14		610
	 */

	public static long binary(int n) {
		long nums[] = new long[n+1];

		for (int i = 1; i <= n; i++) {
			nums[i] = (i <= 2)? i : nums[i-1]+nums[i-2];
			nums[i] %= 15746;
		}

		return nums[n];
	}

}
