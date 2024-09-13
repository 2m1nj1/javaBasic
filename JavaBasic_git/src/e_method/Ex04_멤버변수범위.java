package e_method;

public class Ex04_멤버변수범위 {
	
	// 멤버 변수 : class 안의 변수. 알아서 자동 초기화가 되기 때문에 초기화 ... 안해도 되긴 함 
	static int a = 10, b = 10;
	static int sum;
	
	public static void main(String[] args) {
	
		add();
		System.out.println("합 : " + sum);
	}
	
	static void add() {
		sum = a + b;
	}

}
