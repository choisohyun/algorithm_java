package algorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class boj10989 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(br.readLine());
		int []ans = countingSort(arr);
		
		// ���
		for (int n : ans)
			bw.write(n + "\n");
		br.close();
		bw.close();
	}
	// hash map 
	// ��������
	public static int[] countingSort(int[] nums) {
		// �ִ� ã��
		int max = 0;
		for (int i = 0; i < nums.length; i++) 
			if (max < nums[i])
				max = nums[i];
		
		int[] ans = new int[nums.length];	//���� �迭
		int[] cnt = new int[max+1];			//���� ���� ���� �迭
		
		// �� ���� ���� ����
		for (int i :  nums) cnt[i]++;
		
		// ���� ���� ���� ����
		for (int i = 1; i < cnt.length; i++) 
			cnt[i] += cnt[i-1];
		
		// cnt �迭�� �̿��� ����
		for (int i = nums.length-1; i >= 0; i--)
			ans[--cnt[ nums[i] ]] = nums[i];
		
		return ans;
	}
}
