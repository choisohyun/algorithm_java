package algorithm;

import java.util.Scanner;

public class BOJ9663 {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		/* 
		 * ���ٿ� �ϳ��� Queen�� ���� �����ϹǷ� 1���� �迭 ����
		 * N+1ũ���� �迭�� ������ �� ��ͷ� ����� ���� ���Ѵ�.
		 * int array�� ���� �� 0���� �ʱ�ȭ�ǹǷ� �迭 ��Ұ� 1���� �����ϵ��� �Ѵ�.
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
	 * ���� 1. ���� ���� �ְų�
	 * ���� 2. �밢���� ��ġ�� ��츦 �����ϰ� ã�´�.
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