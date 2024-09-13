package b_operator;

public class Ex07_OperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = 75;
		char atten = 'A';
		
		// 우등생 기준
		if ( grade >= 80 || atten == 'A' ) {
			// grade>=80 : false
			// atten == 'A' : true
			System.out.println(" 성적이 80점 이상 이거나 태도가 A라면 우등생입니다."); // true
		}
		
		// 성적향상반
		if( grade >= 80 && atten == 'A' ) {
			// grade>=80 : false
			// atten == 'A' : true
			System.out.println("성적이 80점 이상이고 태도가 A라면  성적향상반 입니다."); // false
		}
		
		
	} // end of void main

} // end of class
