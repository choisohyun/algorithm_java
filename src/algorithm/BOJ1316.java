package algorithm;
/*
 * 백준 1316번 문제: 그룹 단어 체커
 * https://www.acmicpc.net/problem/1316
 * by choisohyun
 */

import java.util.Scanner;

public class BOJ1316 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnt = n;
        
        for (int i = 0; i < n; i++) {
        	String[] str = s.next().split("");
        	boolean[] exi = new boolean[26];
        	
        	for (int idx = 1; idx < str.length; idx++) {
        		if (!str[idx-1].equals(str[idx]) 
        				&& exi[str[idx].charAt(0) - 97] == true) {
        			cnt--;
        			break;
        		}
        		exi[str[idx-1].charAt(0) - 97] = true;
        	}
        }
        s.close();
        System.out.print(cnt);
	}
}