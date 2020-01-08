package algorithm;

import java.util.Scanner;

public class BOJ5622 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int time = 0;
        
        for (int i = 0; i < str.length(); i++) {
        	int n = (int)str.charAt(i) - 59;
        	if (n == 24 || n == 27 || n == 30 || n == 31)
        		n -= 3;
        	time += n / 3 + 1;
        }
        System.out.print(time);
	}
}
