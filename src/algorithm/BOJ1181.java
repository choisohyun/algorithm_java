package algorithm;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BOJ1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> words = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			words.put(str, str.length());
		}
		sc.close();
        List<Map.Entry<String, Integer>> answer = new LinkedList<>(words.entrySet());

		// condition
		Collections.sort(answer, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
                if (arg0.getValue() == arg1.getValue())
                    return arg0.getKey().compareTo(arg1.getKey());
                return arg0.getValue() - arg1.getValue();
			}
			
		});
		for (int i = 0; i < answer.size(); i++)
			System.out.println(answer.get(i).getKey());
	}

}
