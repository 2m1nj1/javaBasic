package b_operator;

public class Ex16_String {

	public static void main(String[] args) {
		
		// 정석 형태
		StringBuffer sb = new StringBuffer("홍길동");
		sb.append("바보");
		// sb = sb + "바보"; //error
		System.out.println(sb);
		
		
		StringBuilder sb2 = new StringBuilder("홍길국");
		sb2.append("바보");
		System.out.println(sb2);
		
		
		// 특권1. new 생략 가능
		String str = "홍길자";
		
		// 특권2. + 연산자 가능
		str = str + "바보";
		str += "바보";
	}

}
