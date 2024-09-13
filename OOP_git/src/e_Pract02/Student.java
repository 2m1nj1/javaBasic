package e_Pract02;

public class Student {

	// member fields : 멤버 변수들 (서로 다른 자료형)
	private String stuInfo = "";
	
	private String name = "";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int total = 0;
	private double avg = 0.0;
	
	// getter / setter
	public String getStuInfo() {
		return stuInfo;
	}

	public void setStuInfo(String stuInfo) {
		this.stuInfo = stuInfo;
		
		String[] ary_stuInfo =  stuInfo.split(" ");
		name = ary_stuInfo[0];
		kor = Integer.parseInt(ary_stuInfo[1]);
		eng = Integer.parseInt(ary_stuInfo[2]);
		math = Integer.parseInt(ary_stuInfo[3]);
	}
	// end of getter / setter
	
	// member methods : 멤버 함수들
	public int calTotal() {
		total = kor + eng + math;
		return total;
	} // end of calTotal()
	
	public double calAvg() {
		avg = (double) total / 3;
		return avg;
	} // end of calAvg()
	
	public void output() {
		calTotal();
		calAvg();
		System.out.println(name + ", 총점 : " + total + ", 평균 " + avg);
	} // end of output()
	
	
	
} // end of class