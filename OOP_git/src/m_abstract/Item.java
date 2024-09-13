package m_abstract;

public abstract class Item {
	
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
	
	// Overridng을 위해 반드시 정의는 되어있어야 하는데...
	// 혹시나 Sub_Class에서 실수로 함수명을 오타 냈을 때
	// Super_Class의 의미 없는 함수가 실행되지 않게 하기 위해서 아래와 같이 함
	
	public abstract void output();
	// abstract public void output();
	// 지정자 위치 상관없음
	
} // end of class
