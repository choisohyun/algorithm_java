package algorithm;

import java.util.Scanner;

public class BOJ2442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		printStar(n);
	}

	public static void printStar(int n) {
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; ++j) {
                System.out.print("*");
            }
            for (int j = 1; j <= i - 1; ++j) {
                System.out.print(" ");
            }
		}
		
	}

}
