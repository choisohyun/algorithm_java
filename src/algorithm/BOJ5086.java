package algorithm;

import java.util.Scanner;

public class BOJ5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			int first = sc.nextInt();
			int second = sc.nextInt();

			if (first == 0 && second == 0) break;
			sb.append(judgeNumber(first, second) + "\n");
		}
		sc.close();
		System.out.println(sb);
	}

	public static String judgeNumber(int first, int second) {
		String result = "";

		if (second % first == 0) {
			result = "factor";
		}
		else if (first % second == 0) {
			result = "multiple";
		}
		else {
			result = "neither";
		}

		return result;
	}

}
