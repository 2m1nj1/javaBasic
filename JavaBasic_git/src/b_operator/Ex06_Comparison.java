package b_operator;

public class Ex06_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 89;
		int eng = 87;
		int math = 77;

		int total = kor + eng + math;
		double avg = (double) total / 3;

		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("=============");
		System.out.println("총    점 : " + total);
		System.out.printf("평    균 : %.1f\n", avg);

		// ------------------------------------------------------------

		char grade = '0';

		if (avg >= 90) {
			grade = 'A';
		} else if (90 > avg && avg >= 80) { // 그렇지 않다면 (else if)를 이용하기 때문에 avg >= 80 만 서도 된다
			grade = 'B';
		} else if (80 > avg && avg >= 70) {
			grade = 'C';
		} // end of if
		
		/*
		// 해당 코드은 잘 못 댐 
		if (avg >= 90) {
			grade = 'A';
		} if (avg >= 80) { 
			grade = 'B';
		} if (avg >= 70) {
			grade = 'C';
		} // end of if
		*/

		System.out.println("학    점 : " + grade);
	}

}
