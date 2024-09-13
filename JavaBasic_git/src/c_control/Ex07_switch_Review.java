package c_control;

public class Ex07_switch_Review {

	public static void main(String[] args) {
		
		int kor = 90, eng = 80, math = 70;
		int total = kor + eng + math;
		int avg =  total / 3;;
		char grade = '0'; // 초기화 시 grade = '\u0000'; 가 원래 교과서적 정석
		
		// switch 문 내에 입력 변수는 제한 되어 있어서 long, float, double 형은 넣을 수 없다.
		switch (avg / 10) {
		case 10: // break; 를 하지 않아서 case 10:는 case9:의 코드를 실행하게 된다.
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		default: grade = 'F'; break;
		} // end of switch

		System.out.println("학점 : " + grade);
	} // end of void main

} // end of class
