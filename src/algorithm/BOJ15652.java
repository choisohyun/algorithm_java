package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ15652 {

	static int[] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());	// 1부터 n까지
		int m = Integer.parseInt(st.nextToken());	// m개를 고르기

		arr = new int[m];
		dfs(n, m, 0);
		br.close();
		bw.close();
	}
	
	public static void dfs(int n, int m, int d) throws IOException {
		if (d == m) {
			for (int s : arr)
				bw.write(s + " ");
			bw.write("\n");
		} else {
			for (int i = 1; i <= n; i++) {
				arr[d] = i;
				
				if (d == 0 || arr[d-1] <= i)
					dfs(n, m, d+1);
			}
		}
	}

}
