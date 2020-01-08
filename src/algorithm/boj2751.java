package algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.io.IOException;

public class boj2751 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		int N = Integer.parseInt(br.readLine());
		TreeSet<Integer> ts = new TreeSet<>();
		
		for (int i = 0; i < N; i++)
			ts.add(Integer.parseInt(br.readLine()));
		
		for (int i : ts)
			System.out.println(i);
		
		/*
		 * 우선순위큐 : 
		 * */
	}

}
