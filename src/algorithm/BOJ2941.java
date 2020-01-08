package algorithm;

import java.util.Scanner;

public class BOJ2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i = 0; i < croatia.length; i++) {
			if (str.contains(croatia[i]))
				str = str.replaceAll(croatia[i], "1");		
		}
		System.out.println(str.length());
		System.out.print(str);
	}
}