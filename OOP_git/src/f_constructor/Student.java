package f_constructor;

public class Student {

	// member fields : 멤버 변수들 (서로 다른 자료형)
	// heap 영역의 메모리라서 초기화를 따로 하지 않아도 기본적으로 null이나 0으로 초기화가 되어있다
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
	// =================================
	// 생성자 함수 Constructor
	public Student() {
//		name = "박길동";
//		kor = 50;
//		eng = 50;
//		math = 50;
		//Student("홍길동", 50, 50, 50); // error!
		this("홍길동", 50, 50, 50); // this() 함수
		System.out.println("기본 생성자 호출");
	} // end of Student()
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자 있는 생성자 호출");
	} // end of Student()
	
	// member methods : 멤버 함수들
	public int calTotal() {
		total = kor + eng + math;
		return total;
	} // end of calTotal()
	
	public double calAvg() {
		avg = (double) total / 3;
		return avg;
	} // end of calAvg()
	
	
	// setter / getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	// end of setter / getter
	
} // end of class