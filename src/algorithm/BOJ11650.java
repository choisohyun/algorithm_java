package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ11650 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int loc[][] = new int[n][2];

        for (int i = 0; i < n; i++) {
        	loc[i][0] = s.nextInt();
        	loc[i][1] = s.nextInt();
        }
        s.close();
        solution(loc);
	}
	
	public static void solution(int[][] loc) {
        Arrays.sort(loc, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
            	if (o1[0] == o2[0])
            		return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < loc.length; i++) {
        	System.out.println(loc[i][0] + " " + loc[i][1]);
        }		
	}
}
