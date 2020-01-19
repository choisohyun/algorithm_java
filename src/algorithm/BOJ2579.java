package algorithm;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BOJ2579 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score[] = new int[n+1];
		int accu_score[] = new int[n+1];

		IntStream.range(1, n+1).forEach(x -> {
			score[x] = sc.nextInt();
		});
		sc.close();
		
		accu_score[1] = score[1];
		accu_score[2] = score[1] + score[2];
		IntStream.range(3, n+1).forEach(i -> {
			accu_score[i] = Math.max(score[i]+score[i-1]+accu_score[i-3], score[i]+accu_score[i-2]);
		});
		System.out.print(accu_score[n]);
	}

}
