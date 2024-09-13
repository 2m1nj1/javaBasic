package i_innerclass;

/*
 *  inner class : 클래스 안에 클래스 (멤버 취급)
 */

class Outer {
	static class Inner{ // Inner class 는 멤버 취급을 하다보니 class여도 static 붙일 수 있다.
		static void najabara() {
			System.out.println("잡아봅시다.");
		} // end of najabara()
	} // end of class Inner
} // end of class Outer

public class MainTest {

	public static void main(String[] args) {
		
		// Inner class 함수 호출을 위한 정석 방법
//		Outer o = new Outer();
//		Outer.Inner in = o.new Inner();
//		
//		in.najabara();
		
		// class Inner를 static 붙여서 클래스명으로 접근 가능
//		Outer.Inner in = new Outer.Inner();
		
		// najabara();도 static 이 된다면 이렇게도 가능
		Outer.Inner.najabara();
		
	} // end of main()
} // end of class
