package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ2108 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in))); 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
 		int visited[] = new int[8001];
       double sum = 0.0;
		
        for (int i = 0; i < n; i++) {
        	nums[i] = Integer.parseInt(br.readLine());
        	visited[nums[i] + 4000]++;
        	sum += nums[i];                                                                                                                                                                                                                  
        }
        br.close();
		Arrays.sort(nums);
		
        bw.write((int) Math.round(sum/n) + "\n");
        bw.write(nums[n/2] + "\n");
        if (n == 1) 
        	bw.write(nums[0] + "\n");
        else 
        	bw.write(mode(visited) + "\n");
        bw.write(nums[n-1] - nums[0] + "\n");
        bw.close();
	}

	public static int mode(int[] visited) {
		ArrayList<Integer> modes = new ArrayList<>();		
		int maxMode = 0;
		
		for (int i = 0; i <= 8000; i++) {
			if (visited[maxMode] < visited[i]) {
				maxMode = i;
				modes.clear();
			}
			else if (visited[i] != 0 && visited[i] == visited[maxMode]) {
				modes.add(i - 4000);
			}
		}
		if (modes.size() != 0) 
			return modes.get(0);
		else 
			return maxMode - 4000;
	}
}
