package l_pract;

public class Student extends Human {
	
	private String number;
	private String major;
	
	// 기본 생성자 함수
	public Student() {
		super("null", 0, 0, 0);
		this.number = "null";
		this.major 	= "null";
	} // end of Student()
	
	// 인자 생성자 함수
	// 6개 인스턴스변수 값 초기화
	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major 	= major;
	} // end of Student()
	
	// Student 정보 return
	public String printInformation() {
		String tmp_Str = super.printInformation();
		String result = tmp_Str + "\t" + number + "\t" + major;
		
		return result;
	} // end of printInformation()
	
} // end of class 
