package algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class boj2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) 
			arr[i] = sc.nextInt();
		
		// 规过1
		Arrays.sort(arr);
		
		// 规过2 - bubble sort
		int tmp, j = 1;
		while (j < N) { 
			for (int idx = 1; idx < N; idx++) {
				
				if (arr[idx] < arr[idx-1]) {
					tmp = arr[idx];
					arr[idx] = arr[idx-1];
					arr[idx-1] = tmp;
				}
			} j++;
		}
		
		for (int i = 0; i < N; i++) 
			System.out.println(arr[i]);
		
		sc.close();
	}

}
