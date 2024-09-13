package d_array;

import java.util.Scanner;

public class Ex06_Pract01 {

	public static void main(String[] args) {

		int pt = 1;	// 정답 시 얻을 수 있는 점수, 연속 정답 시 pt++;
		int totalPt = 0; // 총 점수
		
		int repeatNum = 0; // 테스트 케이스 개수

		Scanner input = new Scanner(System.in);
		System.out.print("Test Case의 개수를 입력하세요 = > ");
		repeatNum = input.nextInt();
		
		//String str[] = new String[repeatNum];
		char oxArry[][] = new char[repeatNum][];
		
		// OX 문자열 입력 받기
		for(int i = 0; i < repeatNum; i++) {
			System.out.print((i+1) + ") 정답(O)/오답(X) 여부를 입력하세요. = > ");
			String str = input.next();
			char[] ch = str.toCharArray();
			
			// OX 문자열 들을 2차원 배열에 저장
			for(int j = 0; j < ch.length ; j++ ) {
				oxArry[i] = ch;
			}
		} // end of for i
		
		// TestCase 출력 - 확인 용
//		for (int i = 0; i < repeatNum; i++) {
//			for(int j =0; j < oxArry[i].length; j++) {
//				System.out.print(oxArry[i][j]);
//			} // end of for j
//			System.out.println();
//		} // end of for i
		
		
		// ====================================================
		// OX 점수 계산
		int totalPtArr[] = new int[repeatNum];
		for (int i = 0; i < repeatNum; i++) {

			for (int j = 0; j < oxArry[i].length; j++) {
				if (oxArry[i][j] == 'o' | oxArry[i][j] == 'O') {
					// 정답인 경우 : (최초 pt값은 1)
					totalPt += pt; // totalPt값에 pt 값 더하기
					pt++; // pt값 증가
				} else if (oxArry[i][j] == 'x' | oxArry[i][j] == 'X') {
					// 오답인 경우 : pt = 1 초기화, totalPt값 변동 없음
					pt = 1;
				} // end of if
			} // end of for j

			totalPtArr[i] = totalPt;
			pt = 1;
			totalPt = 0;
		} // end of for i
		
			
		System.out.println("====================================");
		for(int i = 0; i < repeatNum; i++) {
			System.out.println(totalPtArr[i]);
		} // end of for i
		
		
	} // end of void main

} // end of class
