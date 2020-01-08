package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class BOJ1149 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int n = Integer.parseInt(br.readLine());
        
        int rgb[][] = new int[n][3];
        
        for (int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine()); 
        	for (int j = 0; j < 3; j++) {
        		rgb[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        int result = minCost(rgb);
        bw.write(result+"");
        br.close();
        bw.flush();
        bw.close();
	}

	public static int minCost(int[][] rgb) {
		int result = 0;
		int[] min = new int[3];
		Arrays.fill(min, 1001);
		
		for(int i = 0; i < rgb.length; i++) {
//			System.out.println(rgb[i]);
			for (int j = 0; j < rgb[i].length; j++) {
				int cost = j % 3;
				min[cost] = (min[cost] > rgb[i][j])? rgb[i][j] : min[cost];	
			}

		}
		
		for (int i : min) result += i;
		return result;
	}

}
