package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ10814 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] member = new String[n][2];

		for (int i = 0; i < n; i++) {
            member[i][0] = sc.next();
            member[i][1] = sc.next();
		}
		sc.close();
		
		Arrays.sort(member, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
			
		});
		
		for (int i = 0; i < n; i++) {
			System.out.println(member[i][0] + " " + member[i][1]);
		}
	}

}
