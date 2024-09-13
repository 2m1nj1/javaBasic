package e_method;

public class Ex99_Review05 {

	public static void main(String[] args) {
		
		int result = substract(3, 2);
		System.out.println("result = " + result);
		System.out.println();
		
		greeting(2);
		System.out.println();
		
		loopMethod(3);
		System.out.println();
		
		double area_Cir = circle(3.2);
		System.out.println("area_cir = " + area_Cir);
		System.out.println();
		
		double area_Squ = square(2, 6);
		System.out.println("area_Squ = " + area_Squ);
		System.out.println();
		
	} // end of main()

	// 1)
	static int substract(int a, int b) {
		System.out.println("======== 문제 1 실행 ========");
		int result = a - b;
		return result;
	} // end of substract()
	
	
	// 2)
	static void greeting(int a) {
		System.out.println("======== 문제 2 실행 ========");
		switch(a) {
		case 1: System.out.println("안녕하세요"); break;
		case 2: System.out.println("굿모닝"); break;
		case 3: System.out.println("올라"); break;
		case 4: System.out.println("곤니치와"); break;
		default: System.out.println("잘못된 값을 입력했습니다. 프로그램을 종료합니다."); break;
		}
	} // end of greeting
	
	
	// 3)
	static void loopMethod(int a) {
		System.out.println("======== 문제 3 실행 ========");
		for(int i = 0; i < a; i++) {
			System.out.println("자바는 맛있다");
		}
	} // end of loopMethod()
	
	
	// 4)
	static double circle(double r) {
		System.out.println("======== 문제 4 실행 ========");
		double area_Cir = 0.0;

		if (r < 0) {
			// r이 음수 일 때
			System.out.println("잘못된 값을 입력했습니다. 프로글매을 종료합니다.");
			System.exit(0);
		} else {
			area_Cir = r * r * 3.14;
		}

		return area_Cir;
	} // end of circle()
	
	
	// 5)
	static int square(int a, int b) {
		System.out.println("======== 문제 5 실행 ========");
		int area_Squ = 0;
		
		if (a<0 | b<0) {
			// a가 음수거나, b가 음수 일 때
			System.out.println("잘못된 값을 입력했습니다. 프로글매을 종료합니다.");
			System.exit(0);
		} else {
			area_Squ = a * b;
		}
		
		return area_Squ;
	} // end of square 
} // end of class
