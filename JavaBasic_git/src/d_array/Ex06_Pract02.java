package d_array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex06_Pract02 {

	public static void main(String[] args) {

		int rptNum = 0;	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Test Case의 개수를 입력하세요 = > ");
		rptNum = input.nextInt();
		input.nextLine(); // 개행문자 인식 오류 해결용
		int[][] stuScArry = new int[rptNum][]; // 학생 수와 점수를 저장할 배열 선언
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		// 학생 수와 점수 입력 받고 그 값을 배열에 저장하기
		for (int i = 0; i < rptNum; i++) {
			System.out.println(">> 학생 수(1~1000)와 점수(1~100)를 입력하세요. (e.g. 5 50 50 70 80 100)");
			String str = input.nextLine(); // 문자열 str에 저장			
			StringTokenizer st = new StringTokenizer(str);
			int stCnt = st.countTokens();
			
			int[] tmp = new int[stCnt];
			int j = 0;
			while (st.hasMoreTokens()) {
				tmp[j] = Integer.parseInt(st.nextToken());
				j++;
			} // end of while
			stuScArry[i] = tmp;
		} // end of for i


		// TestCase 출력 - 확인 용
//		for (int i = 0; i < rptNum; i++) {
//			for(int j =0; j < stuScArry[i].length; j++) {
//				System.out.print(stuScArry[i][j] + " ");
//			} // end of for j
//			System.out.println();
//		} // end of for i
//		
		
		// ====================================================
		// 반 별 평균 구하기
		int scTotal = 0; // 반 별 총합 점수
		
		int[] scTotalArry = new int[rptNum];
		double[] scAvgArry = new double[rptNum];

		for (int i = 0; i < rptNum; i++) {
			int stuNum = stuScArry[i][0]; // 학생 수
			for (int j = 1; j < stuScArry[i].length; j++) {
				scTotal += stuScArry[i][j];
			} // end of for j
			scTotalArry[i] = scTotal;
			scAvgArry[i] = scTotal / stuNum;
			//System.out.println(scTotalArry[i] + " " + scAvgArry[i]);
			scTotal = 0;
			stuNum = 0;
		} // end of for i
		
		
		// ====================================================
		// 반 별 평균 넘는 인원 비율 구하기
		int cnt = 0;
		double[] propArr = new double[rptNum];
		for (int i = 0; i < rptNum; i++) {
			int stuNum = stuScArry[i][0]; // 학생 수
			for (int j = 1; j < stuScArry[i].length; j++) {
				if (stuScArry[i][j] > scAvgArry[i]) {
					cnt++;
					//System.out.printf("scAvgArry[%d] = %.3f,  cnt = %d \n", i, scAvgArry[i] , cnt);
				} // end of if
			} // end of for j
			//System.out.printf("cnt = %d, stuNum = %d \n", cnt, stuNum);
			propArr[i] = (double)cnt/stuNum;
			//System.out.printf("propArr[%d] = %.3f \n", i, propArr[i]);
			cnt = 0;
		} // end of for i
		
		System.out.println();
		System.out.println("============================");
		System.out.println();
		
		// 비율 출력
		for(int i = 0; i<rptNum; i++) {
			System.out.printf( "%.3f%%\n", propArr[i]*100);
		} // end of for i
		
		
		
		
		
	} // end of void main

} // end of class
