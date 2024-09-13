package d_array;

import java.util.Scanner;

public class Ex02_Grade01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 = > ");
		int stuNum = input.nextInt();
		
		int [] korScore = new int[stuNum];
		
		for(int i = 0; i < korScore.length; i++) {
			System.out.printf(i + "번 학생의 국어점수를 입력하세요 = > ");
			korScore[i] = input.nextInt();
		} // end of for
		
		// 총점 구하기
		int korTotalSc = 0;
		for(int i = 0; i < korScore.length; i++) {
			korTotalSc += korScore[i];
		} // end of for
		
		
		// 평균 구하기
		double korAvgSc = korTotalSc / stuNum;
				
		// 총점과 평균 출력
		System.out.println("=====================");
		System.out.println("총 점 : " + korTotalSc);
		System.out.printf("평 균 : %.1f\n", korAvgSc);
		
		
	} // end of void main

} // end of class
