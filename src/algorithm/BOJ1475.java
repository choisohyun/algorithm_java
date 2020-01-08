package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n = sc.next().replaceAll("9","6").split("");
		sc.close();
		
		int[] set = new int[9];
		for (String s : n) 
			set[Integer.parseInt(s)]++;		
		
		if (set[6] % 2 != 0) set[6] = set[6] / 2 + 1;
		else set[6] /= 2;
		
		Arrays.sort(set);
		System.out.print(set[8]);
	}
}