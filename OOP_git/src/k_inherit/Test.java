package k_inherit;

public class Test {

	public static void main(String[] args) {
		
//		Mommy m = new Mommy();
//		m.gene();
//		m.job();
//		
		// 딸 클래스만 객체 선언해도 엄마 개체도 메모리 적으로 생성은 된다. (생성자 함수 결과 참고)
//		Daughter d = new Daughter();
//		d.gene();
//		d.study();
//		d.job(); // 부모 클래스 함수 호출 가능

		// ===============================
		// 변수는 부모 클래스이고 객체는 자식 클래스
		Mommy d = new Daughter();
		d.job();
		d.gene();
		//d.study();
		
		
		// ===============================
		// [ casting ] 
		// 참조형에서 부모 - 자식 관계가 있는 클래스라면
		// 캐스팅 가능
		//
		// 아무 관계 없는 클래스 끼리는 캐스팅 불가능
		// e.g.
		// String a = new String();
		// StringBuffer b = (StringBuffer)a;
//		Mommy a = new Mommy();
//		Daughter d = (Daughter) a; // 컴파일이 되긴 하나 오류 발생
		
//		Daughter d = new Daughter();
//		Mommy m = (Mommy)d; // up casting
//		Daughter d2 = (Daughter)m; // down casting
		
		// 연산자 : instanceof
//		Daughter d = new Daughter();
//		if (d instanceof Daughter) {
//			// d의 클래스 객체를 확인
//			System.out.println("Daugther 클래스 객체");
//		} // end of if
//		
//		if (d instanceof Mommy) {
//			System.out.println("Mommy 클래스 객체");
//			// 출력된다.
//			// 왜냐하면 부모 클래스를 참조한 자식 클래스는 생성될 때에 
//			// 부모 클래스를 무조건 생성한 후에 자식 클래스를 생성하니까...
//		}
		
	} // end of main()
	
} // end of class
