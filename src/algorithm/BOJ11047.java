package algorithm;

import java.util.Scanner;

public class BOJ11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int coins[] = new int[n];
		
		for (int i = n-1; i >= 0; i--) {
			coins[i] = sc.nextInt();			
		}
		sc.close();
		System.out.print(solution(k, coins));
	}

	public static int solution(int k, int[] coins) {
		int result = 0;
		
		for (int i = 0; i < coins.length; i++) {
			if (k / coins[i] > 0) {
				result += k / coins[i];
				k %= coins[i];
			}
		}
		
		return result;
	}

}
