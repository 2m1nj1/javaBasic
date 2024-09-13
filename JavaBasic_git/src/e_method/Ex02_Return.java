package e_method;

/*
 * 함수가 끝나기 전에 함수를 끄탠려고 할 때 : reutrn
 * 
 * return 할 때, 단 하나의 값을 반환 가능
 */

public class Ex02_Return {

	public static void main(String[] args) {
	
		int sum = add(); // return 값을 저장하지 않으면 날아가기 때문에 main 내에서 따로 선언한 변수에 저장해줘야 한다.
		System.out.println("합 = " + sum);
		
	} // end of void main

	static int add() {
		int a = 10, b = 20;
		int sum = a + b;
		return sum; // 반환하는 data가 있으니, add() 함수는 void 형이 아닌 변수 sum에 맞는 int 형으로 선언해야 한다
	} // end of void add
} // end of class
