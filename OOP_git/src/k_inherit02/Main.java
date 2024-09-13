package k_inherit02;

public class Main {

	public static void main(String[] args) {

//		Book b = new Book("0001", "자바 책", "ICT", "이민지");
//		b.output();
//		
//		Book b2 = new Book();
//		b2.output();
		
		// 부모 변수에 자식 객체 생성
		Item b = new Book("0001", "자바 책", "ICT", "이민지");
		b.output();
	} // end of main()
	
} // end of class
