package algorithm;

import java.util.Scanner;

public class BOJ2902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] longName = sc.next().split("-");
		sc.close();
		String answer = "";
		
		for (String name : longName) 
			answer += String.valueOf(name.charAt(0));
		System.out.print(answer);
	}
}