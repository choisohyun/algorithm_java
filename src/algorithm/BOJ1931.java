package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int time[][] = new int[n][2];

		for (int i = 0; i < n; i++) {
			time[i][0] = sc.nextInt(); // start
			time[i][1] = sc.nextInt(); // end
		}
		sc.close();
		
		System.out.print(solution(time));
	}

	private static int solution(int[][] time) {
		int result = 0;
		
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1])
					return o1[0] - o2[0]; // start time 기준
				return o1[1] - o2[1]; // end time 기준으로 정렬
			}
			
		});
		
		int last = 0;
		for (int i = 0; i < time.length; i++) {
			if (last <= time[i][0]) {
				last = time[i][1];
				result++;
			}
		}
		
		return result;
	}

}
