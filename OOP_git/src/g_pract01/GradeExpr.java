package g_pract01;

public class GradeExpr {

	private int[] jumsu;
	private int total;
	private double avg;
	private int high_jumsu;
	private int bad_jumsu;
	
	// 생성자 함수
	public GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
		
		// 1) 생성자 함수를 통한 출력 방법
		System.out.println("====================================");
		System.out.println("*** 생성자 함수를 통한 배열 출력 ***");
		System.out.print("점수들 : ");
		for(int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i]);
			if(i < jumsu.length - 1) {
				System.out.print(", ");
			} // end of if
		} // end of for
		System.out.println();
	} // end of GradeExpr()

	public double getAverage() {
		avg = (double) total / jumsu.length;
		return avg;
	} // end of getAverage()

	public int getTotal() {
		for (int i = 0; i < jumsu.length; i++) {
			total += jumsu[i];
		} // end of for
		
		return total;
	} // end of getTotal()

	public int getGoodScore() {
		for (int i = 0; i < jumsu.length; i++) {
			if (high_jumsu < jumsu[i]) {
				high_jumsu = jumsu[i];
			} // end of if
		} // end of for
		
		return high_jumsu;
	} // end of getGoodScore()

	public int getBadScore() {
		
		bad_jumsu  = jumsu[0]; // 최하점이 0점 이상일 수도 있으니 일단 첫 값을 넣어준다
		
		for (int i = 1; i < jumsu.length; i++) {
			if (bad_jumsu > jumsu[i]) {
				bad_jumsu = jumsu[i];
			} // end of if
		} // end of for
		
		return bad_jumsu;
	} // end of getBadScore()

} // end of class
