package algorithm;

import java.util.Scanner;

public class BOJ15650 {
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 1부터 n까지
		int m = sc.nextInt();	// 중복 없이 m개를 고르기
		sc.close();

		arr = new int[m];
		visited = new boolean[n+1];
		
		dfs(n, m, 0);
	}

	private static void dfs(int n, int m, int i) {
		if (i == m) {
			for (int idx : arr) {
				System.out.print(idx + " ");
			}System.out.println();
		}
		else {
			for (int j = 1; j <= n; j++) {
				if (!visited[j]) {
					visited[j] = true;
					arr[i] = j;
					
					if (i == 0 || arr[i-1] < j)
						dfs(n, m, i+1);
					visited[j] = false;
				}
				
			}
		}
	}

}
