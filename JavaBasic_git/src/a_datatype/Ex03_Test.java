package a_datatype;

public class Ex03_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 국어점수 변수 선언
		// 영어점수 변수 선언
		int testScoreKor;
		int testScoreEng;
		int testScoreTotal;
		
		double testScoreAvg = 0;
		
		// 국어점수 변수에 90점 지정
		// 영어점수 변수에 100점 지정
		testScoreKor = 91;
		testScoreEng = 100;
		
		
		// 총점 변수 선언
		// 총점 계산하기
		
		
//		testScoreTotal = testScoreKor + testScoreEng;
//		testScoreAvg = testScoreTotal / 2;
		// 191/2 = 95.5
		// 정수형 끼리 연산한 결과는 정수형이라서
		// 평균 값이 정수형으로 출력된다.
		
		testScoreTotal = testScoreKor + testScoreEng;
		testScoreAvg = testScoreTotal / 2.0; // 소수점 출력을 위해 2 대신 2.0
		
		
		// 총점 출력
		System.out.println("총점 : " + testScoreTotal + "점");
		System.out.println("평균 : " + testScoreAvg + "점");
	}

}
