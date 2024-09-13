package c_control;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex17_Pract04 {

	public static void main(String[] args) {
		// 문제 4
		Scanner input = new Scanner(System.in);
		System.out.print("2~9 숫자 두개를 입력하세요 (e.g. 5 3) = > ");
		String str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int tokenCnt = st.countTokens();
		if(tokenCnt!=2) {
			System.out.println("잘못된 값을 입력했습니다. 프로그램을 종료합니다.");
		}
		
		
		String token1 = st.nextToken();		// 다음 토큰을 token 변수에 대입해요
		int num1 = Integer.parseInt(token1);	// 대입한 값을 Integer로 형변환해서 변슈 int에 대입해요
		
		String token2 = st.nextToken();
		int num2 = Integer.parseInt(token2);
		
		
			
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < num2; j++) {

				System.out.printf("%d * %d = %d\t", num1-j, i+1, (num1-j)*(i+1) );

			} // end of for j

			System.out.println();
		} // end of for i

	}

}
