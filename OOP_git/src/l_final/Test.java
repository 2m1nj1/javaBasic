//package l_final;
//
///*
// * final : 변경불가
// * 
// * 		- final (class 명) : 참조 불가. 해당 클래스를 부모 클래스로 못 삼게된다 
// * 		- final (field 명) :변수  값 변경을 못하게 된다
// * 		- final (method 명) : Overriding 을 못하게 된다
// */
//
//final class Parent {
//	final String field = "부모님 꺼";
//	
//	final void jib() {
//		System.out.println("부모님이 만드신 집");
//	} // end of jib()
//} // end of class Parent
//
//class Child extends Parent {
//	Child() {
//		// field = "내꺼"; // 부모 클래스에서 해당 변수의 지정자가 final이기 때문에 값 변경
//	} // end of Child()
//	
////	void jib() {
////		System.out.println("자식이 탕진");
////	} // end of jib()
//} // end of class Child
//
//public class Test {
//
//	public static void main(String[] args) {
//		
//		Parent p = new Child();
//		System.out.println(p.field);
//		p.jib();
//	} // end of main()
//
//} // end of class Test
