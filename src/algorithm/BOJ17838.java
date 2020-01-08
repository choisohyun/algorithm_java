package algorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class BOJ17838 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
	        bw.write( solution(br.readLine()) + "\n" );
        }
        br.close();
        bw.close();
	}
	
	public static int solution(String s) {
        String arr[] = s.split("");
        
        String fir = arr[0];
        String sec = arr[2];
        int result = 0;
        
        if (arr.length != 7 || fir.equals(sec)) 
        	result = 0;
        
        else if (arr[0].equals(fir) && arr[1].equals(fir) && arr[4].equals(fir))
        	if (arr[2].equals(sec) && arr[3].equals(sec) 
        			&& arr[5].equals(sec) && arr[6].equals(sec))
        		result = 1;
		return result;
	}
}
