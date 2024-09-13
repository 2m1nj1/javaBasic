package k_inherit02;

public class Book extends Item {
	
	private String writer;
	private String publisher;

	// 기본 생성자 함수
	public Book() {
		no 			= "0000";
		name 		= "제목없음";
		publisher 	= "미정";
		writer 		= "무명";
		System.out.println("자식 클래스의 기본 생성자 함수");
	} // end of Book()
	
	// 인자 생성자 함수
	public Book(String no, String name, String publisher, String writer) {
		//super.no 		= no;
		//super.name 		= name;
		super(no, name); // 부모 클래스의 인자 생성자 함수 호출
		this.publisher 	= publisher;
		this.writer 	= writer;
		System.out.println("자식 클래스의 인자 생성자 함수");
	} // end of Book()
	
	public void output() {
		
		System.out.println("BOOK 번호 : " + no);
		System.out.println("BOOK 이름 : " + name);
		System.out.println("BOOK 출판사 : " + publisher);
		System.out.println("BOOK 작가 : " + writer);
	} // end of output()
} // end of class
