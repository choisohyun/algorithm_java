package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1003 { 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		String tmp[] = new String[t];
		
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			tmp[i] = fiboCnt(n) + " " + fiboCnt(n+1);
			bw.write(tmp[i] + "\n");
		}

		br.close();
		bw.close();
	}
	/**
	 * fibo(0) --- 0이 1번	1이 0번
	 * fibo(1) --- 0이 0번	1이 1번
	 * fibo(2) --- 0이 1번	1이 1번
	 * fibo(3) --- 0이 1번	1이 2번
	 * fibo(4) --- 0이 2번	1이 3번
	 * fibo(5) --- 0이 3번	1이 5번
	 * fibo(6) --- 0이 5번	1이 8번
	 * fibo(7) --- 0이 8번	1번 13번
	 * fibo(8) --- 0이 13번
	 */

	public static int fiboCnt(int n) {
		int cnt0 = 1;
		int cnt1 = 0;
		int cnt2 = 1;
		
		if (n == 0) {
			return cnt0;
		}
		else if (n == 1) {
			return cnt1;
		}
		else {
			for (int i = 1; i <= n; i++) {
				cnt0 = cnt1;
				cnt1 = cnt2;
				cnt2 = cnt0 + cnt1;
			}
			return cnt0;
		}
	}
}
