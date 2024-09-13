package b_encapsulation;

/*
 *  클래스 이름과 java 파일명이 동일해야 한다.
 *  대소문자 구별 !!!
 *  
 *  [권장] 클래스 이름은 대문자로 시작
 */

public class Student {

	// member fields : 멤버 변수들 (서로 다른 자료형)
	private String name;
	private int kor, eng, math;
	private int total;
	private double avg;
	
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
	
	
} // end of class