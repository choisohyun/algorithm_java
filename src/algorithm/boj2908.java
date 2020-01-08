package algorithm;

import java.util.Scanner;

public class boj2908 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = reverse(sc.next());
        int b = reverse(sc.next());
        sc.close();
        
        if (a > b)
        	System.out.println(a);
        else
        	System.out.println(b);
	}
	
	public static int reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		int result = Integer.parseInt(sb.toString());
		return result;
	}
}
