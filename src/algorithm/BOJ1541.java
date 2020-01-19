package algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BOJ1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.next().split("-");
		sc.close();

		System.out.print(calculator(input));
	}

	public static int calculator(String[] input) {
		int result = 0;

		for (int number = 0; number < input.length; number++) {
			List<Integer> plus = Arrays.stream(input[number].split("\\+"))
					.map(Integer::parseInt)
					.collect(Collectors.toList());

			if (number != 0) {
				result -= plus.stream().reduce(0, Integer::sum);
			}
			else {
				result += plus.stream().reduce(0, Integer::sum);
			}
		}
		return result;
	}

}
