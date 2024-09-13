package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02_Grade02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("학생들의 국어점수를 입력하세요 (입력 예시 : 10/10/10/10/10) = > ");
		String str = input.nextLine();							// 입력 받은 값을 변수 str에 저장
		StringTokenizer st = new StringTokenizer(str, "/");		// str에 저장된 값을 "/"를 기준으로 잘라서 배열 st에 저장
		
		// 학생 수 count
		int stuNum = st.countTokens(); 					// Token 갯수를 변수 stuNum(학생 수)에 저장
		int[] korSc = new int[stuNum];					// stuNum 만큼의 메모리를 가진 korSc 배열 생성
		int korTotalSc = 0;								// 변수 korTotalSc 선언 + 초기화
		
		int i =0;
		while(st.hasMoreTokens()) {
			korSc[i] = Integer.parseInt(st.nextToken());
			korTotalSc += korSc[i]; // 총점 구하기
			i++;
		}
		
		// 평균 구하기
		double korAvgSc = korTotalSc / stuNum;
		
		// 총점과 평균 출력
		System.out.println("=====================");
		System.out.println("학생 인원");
		System.out.println("총    점 : " + korTotalSc);
		System.out.printf("평    균 : %.1f\n", korAvgSc);
		
		
		
		
	} // end of void main

} // end of class
