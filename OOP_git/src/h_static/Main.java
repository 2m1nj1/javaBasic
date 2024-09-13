package h_static;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
//		System.out.println("책 갯수 : " + b1.count);
//		System.out.println("책 갯수 : " + b2.count);
//		System.out.println("책 갯수 : " + b3.count);

		System.out.println("책 갯수 : " + Book.getCount());
		
		// static 은 클래스 명으로 접근 가능 
		// static 이 아니면 접근 시 무조건 객체 생성 필요
		
		
	} // end of main()

} // end of class