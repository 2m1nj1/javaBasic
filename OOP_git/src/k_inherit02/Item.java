package k_inherit02;

public class Item {
	
	// 자식 클래스에게만 접근 허용하는 변수 선언
	protected String no;
	protected String name;
	
	public Item() {
		no		= "0";
		name 	= "";
		System.out.println("부모 클래스의 기본 생성자 함수");
	} // end of Item()
	
	public Item(String no, String name) {
		this.no 	= no;
		this.name 	= name;
		System.out.println("부모 클래스의 인자 생성자 함수");
	} // end of Item()
	
	public void output() {
		
	} // end of output()

} // end of class
