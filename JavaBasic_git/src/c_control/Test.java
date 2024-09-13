package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) {

		/*
		 * -10,000 ≤ numbers의 원소 ≤ 10,000 1 ≤ numbers의 길이 ≤ 1,000
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 10개를 입력해 주세요(ex 1 2 3 4):");
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str);

		int i = 0;
		int sum = 0;
		int avg = 0;
		while (st.hasMoreTokens()) {
			i++;
			String token = st.nextToken();
			int su = Integer.parseInt(token);
			
			if (su == 0 | i == 11)
				break;
			sum += su;
			avg = sum / i;
		}
		System.out.printf("%d %d", sum, avg);

	} // end of void main

} // end of class
