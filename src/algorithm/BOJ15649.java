package algorithm;

import java.util.Scanner;

public class BOJ15649 {
	static int[] arr;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 1부터 n까지
		int m = sc.nextInt();	// 중복 없이 m개를 고르기
		sc.close();
		arr = new int[m];
		visit = new boolean[n+1];		
		dfs(n, m, 0);
	}
	
	public static void dfs(int n, int m, int d) {
		if (d == m) {
			for (int s : arr)
				System.out.print(s + " ");
			System.out.println("");
		} else {
			for (int i = 1; i <= n; i++) {
				if (!visit[i]) {
					visit[i] = true;
					arr[d] = i;
					dfs(n, m, d+1);
					visit[i] = false;
				}
			}
		}
	}
}
