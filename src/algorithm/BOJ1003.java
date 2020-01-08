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
	 * fibo(0) --- 0�� 1��	1�� 0��
	 * fibo(1) --- 0�� 0��	1�� 1��
	 * fibo(2) --- 0�� 1��	1�� 1��
	 * fibo(3) --- 0�� 1��	1�� 2��
	 * fibo(4) --- 0�� 2��	1�� 3��
	 * fibo(5) --- 0�� 3��	1�� 5��
	 * fibo(6) --- 0�� 5��	1�� 8��
	 * fibo(7) --- 0�� 8��	1�� 13��
	 * fibo(8) --- 0�� 13��
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
