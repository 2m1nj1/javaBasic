package e_method;

public class Ex05_Review {

	public static void main(String[] args) {
		int		data1 = 1000;
		double	data2 = 1.99;
		
		String str = method(data1, data2);
		System.out.println(str);
		
		
	} // end of main()

	static String method(int a, double b) {
		//data1 data2의 값을 여기서 출력
		System.out.println(a);
		System.out.println(b);
		
		String msg = "안녕하세요";
		return msg;
	} // end of method()
	
} // end of class
