package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BOJ11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int withdrawTime[] = new int[n];
		
		IntStream.range(0, n).forEach(x -> {
			withdrawTime[x] = sc.nextInt();
		});
		
		sc.close();
		System.out.print(wholeTime(withdrawTime));
	}

	public static int wholeTime(int[] withdrawTime) {
		int result = 0;
		Arrays.sort(withdrawTime);

		for (int time = 0; time < withdrawTime.length; time++) {
			result += withdrawTime[time] * (withdrawTime.length-time);
		}
		
		return result;
	}
	
}
