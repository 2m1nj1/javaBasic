package n_collection;

public class Ex00_Objects {

	public static void main(String[] args) {
		
		StudentA a = new StudentA ("01234", "홍길동");
		StudentA b = new StudentA ("01234", "홍길동");
	
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		if(a == b) {
			System.out.println("[ a == b] 동일인");
		} else {
			System.out.println("[ a == b] 다른 사람");
		}
		
		// StudentA Class 내에 equals (Overriding) method가 있기 때문에 true, 없으면 false 출력
		if(a.equals(b)) {
			System.out.println("[ a.equals(b) ] 동일인");
		} else {
			System.out.println("[ a.equals(b) ] 다른 사람");
		}
		
		if(a.toString().equals(b.toString())) {
			System.out.println("[ a.toString().equals(b.toString()) ] 동일인");
		} else {
			System.out.println("[ a.toString().equals(b.toString()) ] 다른 사람");
		}
		
	} // end of main()
} // end of class

class StudentA /* extends Object */ {
	private String num;
	private String name;
	
	public StudentA(String num, String name) {
		this.num 	= num;
		this.name 	= name;
	} // end of StudentA()
	
	// Overriding (Super_Class : Object)
	public boolean equals(Object obj) {
		// Object 타입으로 변수를 받았기 때문에 StudentA로 형변환! (Super_Class의 변수는 Sub_Class로 형변환 가능)
		StudentA other = (StudentA)obj;
		
		if (num.equals(other.num)) {
			return true;
		} else {
			return false;
		} // end of if
	} // end of equals()
	
	// Overriding (Super_Class : Object)
	public String toString() {
		return "학번 : " + num + ", 이름 : " + name;
	} // end of toString()
} // end of class
