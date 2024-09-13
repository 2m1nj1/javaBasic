package b_operator;

public class Ex09_ShortCircuitLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Short Cirucuit Logic
		 * 단축 평가 계산
		 * 
		 */
		
		
		int a = 3;
		if ( a > 3 && ++a > 3  ) {
			System.out.println("&& 조건 만족");
		} // end of if
		
		System.out.println("&& A = " + a); // A = 3 
		// 다른 언어는 이런 상황에서 A = 4 출력 된다.
		// if ( a > 3 && ++a > 3  ) 효율을 위해서 a > 3 이 false 이기 때문에 && 뒤의 코드를 실앵하지 않음
		
		System.out.println("===================================");
		a = 3;
		if ( a > 3 || ++a > 3 ) {
			System.out.println("|| 조건 만족");
		} // end of if
		
		System.out.println("|| A = " + a );
		System.out.println("===================================");
		
		
		// 이(2)진 로직 (일반 논리)
		int b = 3;
		if ( b > 3 & ++b > 3 ) {
			System.out.println("& 조건 만족");
		} // end of if
		System.out.println("& B = " + b); // B = 4 
		System.out.println("===================================");
		
		b = 3;
		if ( b > 3 | ++b > 3 ) {
			System.out.println("| 조건 만족");
		} // end of if 
		System.out.println("| B = " + b);
		
		//==================================================================================
		
		
	} // end of void main

} // end of class
