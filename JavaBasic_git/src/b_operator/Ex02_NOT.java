package b_operator;

public class Ex02_NOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일반 논리 NOT
		boolean result = 3 > 4;
		System.out.println(result); // false
		System.out.println(!result); // true
		
		// 이진 논리 NOT
		int a = 15;
		// 0000 0000	0000 0000	0000 0000	0000 1111
		// 가장 왼쪽 값 0: 양수, 1: 음수 라는 의미 
		
		System.out.println(a);
		// [0]000 0000	0000 0000	0000 0000	0000 1111
		System.out.println(~a);
		// [1]111 1111	1111 1111	1111 1111	1111 0000
		
	} // end of void main

} // end of class
