package g_pract01;

import java.util.Arrays;
import java.util.Scanner;


public class GradeTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(">> 학생 수를 입력하세요. -> ");
		int stuNum = input.nextInt();
		
		// 입력된 데이터 개수 크기의 배열 생성
		int[] stuScore = new int[stuNum];
		
		// 배열에 데이터 입력 받기
		for(int i = 0; i < stuScore.length; i++) {
			System.out.print(">> " + (i+1) + "번째 학생의 점수를 입력하세요. - > ");
			stuScore[i] = input.nextInt();
		} // end of for
				
		
		// 객체 생성
		GradeExpr gE = new GradeExpr(stuScore);
		
		// 2) 배열 자체를 출력 방법
		System.out.println("====================================");
		System.out.println("*** toString() 함수를 이용한 배열 출력 ***");
		System.out.print("점수들 : " + Arrays.toString(stuScore));
		System.out.println();
		
		// 메서드 호출 후 그 수행 결과 출력
		System.out.println("====================================");
		System.out.println("총점 : " + gE.getTotal());
		System.out.printf("평균 : %.2f\n", gE.getAverage());
		System.out.println("최고 점수 : " + gE.getGoodScore());
		System.out.println("최저 점수 : " + gE.getBadScore());
		
	} // end of main()

} // end of class
