package e_method;

/*
 * 인자 : argument
 * 매개변수 : parameter
 * 
 * 인자 = 매개변수
 * 
 */

public class Ex01_Argument01 {

	public static void main(String[] args) {
	
		// DATA
		int a = 10, b= 20;
		
		add(a, b); // void main 함수 밖에 있는 add()에서 변수 a, b를 사용할 수 있도록 인자를 넣어줌
	} // end of void main
	
	static void add(int a, int b) { // 매개변수 : parameter
		
		// DATA에 대한 처리
		int sum = a + b;
		System.out.println("합 : " + sum);
	} // end of void add

} // end of class
