package b_operator;

public class Ex13_AssignOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 7;
		
		a += b;
		System.out.println("+= 결과 : " + a); // 17
		
		a -= b;
		System.out.println("-= 결과 : " + a); // 10
		
		a *= b;
		System.out.println("*= 결과 : " + a); // 70
		
		a /= b;
		System.out.println("/= 결과 : " + a); // 10
		
		a %= b;
		System.out.println("%= 결과 : " + a); // 3
		
	}

}
