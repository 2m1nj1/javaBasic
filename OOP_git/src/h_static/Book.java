package h_static;

/*
 * static : 공유
 * 
 * 		메모리 단 하나 설정 (지정)
 * 		클래스명 접근(!!!!!!!!!!!!!!!!!!!!!!!!!!!)
 */

public class Book {
	
	private static int count;
	
	// static의 초기화
	static {
		System.out.println("딱한번");
	}
	
	public Book() {
		count++;
	} // end of Book()
	
	
	// getter / setter
	public static int getCount() {
		return count;
	}
	
} // end of class
