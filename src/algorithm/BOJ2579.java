package algorithm;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BOJ2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score[] = new int[n+1];
		int accu_score[] = new int[n+1];
		int result = 0;

		IntStream.range(1, n+1).forEach(x -> {
			score[x] = sc.nextInt();
		});
		
		accu_score[1] = score[1];
		accu_score[2] = score[2] + score[3];
		for (int i = 3; i < n-2; i++) {
			accu_score[i] = Math.max(score[i]+score[i-1], score[i]);
		}
		System.out.print(result);
	}

}
