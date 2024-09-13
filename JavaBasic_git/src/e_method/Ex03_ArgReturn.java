package e_method;

public class Ex03_ArgReturn {

	public static void main(String[] args) {
		
		// data
		int a = 10, b = 20;
		int sum = add(a, b);
		
		// 결과
		System.out.println("합 : " + sum);
		
	} // end of void main
	
	static int add(int a, int b) {
		// data 처리
		int sum = a + b;
		return sum;
	} // end of void add

} // end of class
