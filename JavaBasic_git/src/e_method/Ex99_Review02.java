package e_method;

import java.util.Scanner;

public class Ex99_Review02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하세요 = > ");
		int score = input.nextInt();
		
		String result = chkPass(score);
		System.out.println(result + "입니다.");
	} // end of main()
	
	static String chkPass(int score) {
		// 입력 받은 점수를 넘겨 받아서
		// 80점 이상 : '합격' 출력
		// 그 외 : '불합격' 출력
		
		String result = "";
		
		if (score >= 80) {
			result = "합격";
		} else {
			result = "불합격";
		}
		
		return result;
		
	} // end of chkPass()

} // end of calss
