package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2748 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		bw.write(String.valueOf(fibonacchi(n)));
		bw.close();
	}

	public static long fibonacchi(int n) {
		long nums[] = new long[n+1];
		
		for (int i = 0; i <= n; i++) {
			nums[i] = (i < 2)? i : nums[i-1]+nums[i-2];
		}
		
		return nums[n];
	}
}
