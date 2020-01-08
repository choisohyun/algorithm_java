package algorithm;

import java.util.Scanner;

public class BOJ9663 {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		/* 
		 * 한줄에 하나의 Queen만 존재 가능하므로 1차원 배열 선언
		 * N+1크기의 배열을 선언한 후 재귀로 경우의 수를 구한다.
		 * int array는 선언 시 0으로 초기화되므로 배열 요소가 1부터 시작하도록 한다.
		 */		
		for (int i = 1; i <= n; i++) {
			int array[] = new int[n+1];

			array[1] = i;
			nQueen(array, 1);
		}
		System.out.println(cnt);
	}

	public static void nQueen(int array[], int row) {

		if (row == array.length-1) {
			cnt++;
		}
		else {
			for (int i = 1; i < array.length; i++) {
				array[row+1] = i;

				if (isPossible(array, row+1)) 
					nQueen(array, row+1);
			}
		}
	}

	/*	
	 * 조건 1. 같은 열에 있거나
	 * 조건 2. 대각선에 위치할 경우를 제외하고 찾는다.
	 */
	public static boolean isPossible(int[] arr, int row) {
		for (int i = 1; i < row; i++) {
			if (arr[i] == arr[row] ||
					Math.abs(i-row) == Math.abs(arr[i]-arr[row])) 
				return false;
		}

		return true;
	}
}