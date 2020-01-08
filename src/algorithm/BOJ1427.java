package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1427 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] n = s.next().split("");
        s.close();

        solution(n);
	}

	public static void solution(String[] n) {
        int[] toInt = new int[n.length];
        int idx = 0;
        
        for (String num : n) {
        	toInt[idx] = Integer.parseInt(num);
        	idx++;
        }
        Arrays.sort(toInt);
		for (int i = toInt.length-1; i >= 0; i--) {
			System.out.print(toInt[i]);
		}
	}
}
