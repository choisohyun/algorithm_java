package algorithm;

import java.util.Scanner;

public class BOJ1932 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		/**
		 * 
        7
     10   15
   18  16   15
 20  25  20   19
24  30  27  26  24
		 */
		int nums[][] = new int[n+1][n+1];
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= k; i++) {
		        nums[k][i] = sc.nextInt();	
			}
		}
		sc.close();
		
		for (int l = 1; l <= n; l++) {
	        for (int j = 1; j <= l; j++){
	            nums[l][j] += Math.max(nums[l-1][j], nums[l-1][j-1]);
	            System.out.println(l+ " " +j+ " "+nums[l][j]);
	        }
		}
		
		int max = 0;
		for (int i = 0; i <= n; i++) {
			max = (nums[n][i] > max) ? nums[n][i] : max;
		}
		
		System.out.print(max);
	}
}
