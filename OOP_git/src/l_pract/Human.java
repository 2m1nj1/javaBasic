package l_pract;

// 부모 클래스
public class Human {
	
	protected String 	name;
	protected int		age;
	protected int		height;
	protected int		weight;
	
	// 기본 생성자 함수
	public Human() {
		this("null", 0, 0, 0);
	} // end of Human()
	
	// 인자 생성자 함수
	// 4개 인스턴스 변수 값 초기화
	public Human(String name, int age, int height, int weight) {
		this.name 	= name;
		this.age 	= age;
		this.height = height;
		this.weight = weight;
	} // end of Human()
	
	// Human 정보 return
	public String printInformation() {
		String result = name + " " + age + "\t\t" + height + "\t" + weight;
		return result;
	} // end of printInformation()
	
	
} // end of Human
