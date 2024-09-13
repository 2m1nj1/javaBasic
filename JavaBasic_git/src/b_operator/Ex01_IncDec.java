package b_operator;

// 파일명 - 클래스 명 다를 시 오류
// 클래스 명 수정하고 싶으면 Package Explorer - Refactor - Rename 
public class Ex01_IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5, c = 1; // 정수형 변수 a 선언
		int b = 7, d = 1; // 정수형 변수 b 선언
		
																// [ 결과값 ]
		System.out.println("A = " + a + ", B = " + b);			// 5	7
		System.out.println("A = " + a+1 + ", B = " + b+1); 		// 51	71
		System.out.println("A = " + (a+1) + ", B = " + (b+1)); 	// 6	8
		
		System.out.println("\n==========================================\n");
		
		a = a + 1; // a + 1 연산 값을 다시 a에 대입
		b = b + 1; // b + 1 연산 값을 다시 b에 대입
		System.out.println("A = " + a + ", B = " + b); // 위 연산 과정을 통해 새로 나온 a와 b 값 출력
		
		System.out.println("\n==========================================\n");
		
		c++; // c = c + 1;
		d--; // d = d - 1;
		// ++c;
		// --d;
		System.out.println("C = " + c + ", D = " + d); // 위 연산 과정을 통해 새로 나온 a와 b 값 출력
		
		System.out.println("\n==========================================\n");

		
		int z = 10, y = 10;
		int result1 = ++z;
		System.out.println("result1의 값 = " + result1 + ", z = " + z); // 11
		
		int result2 = y++;
		System.out.println("result2의 값 = " + result2 + ", y = " + y); // 10
		
		System.out.println("Z = " + z + ", Y = " + y);
		System.out.println();
		
		System.out.println(">> [ ++z, --y 실행 ]");
		System.out.println("Z = " + ++z + ", Y = " + --y); // z = 12, y = 10 
		System.out.println();
		
		System.out.println(">> [ ++z, --y 실행 ]");
		System.out.println("Z = " + z++ + ", Y = " + y--); // z = 12, y = 10
		System.out.println(">> [ ++z, --y 실행 후 ]");
		System.out.println("Z = " + z + ", Y = " + y); // z = 13, y = 9
		System.out.println();
		
		System.out.println("\n==========================================\n");
		
		
		
	} // end of void main
	
} // end of class
