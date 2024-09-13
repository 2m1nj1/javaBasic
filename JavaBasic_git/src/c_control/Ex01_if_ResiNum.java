package c_control;

public class Ex01_if_ResiNum {
	public static void main(String[] args) {
		
		String id = "990105-4234567";
		String gender = "";
		// String gender; // error! 초기화 필요
		char sex = id.charAt(7);
		
		if (sex == '1' || sex == '3' || sex == '9') {			// 1 3 9 남자
			// System.out.println("남자");
			// String gender = "남자"; // error! 지역변수
			gender = "남자";
		} else if (sex == '2' || sex == '4' || sex == '0') {	// 2 4 0 여자
			// System.out.println("여자");
			gender = "여자";
		} 
		
		System.out.println("당신은 " + gender + "입니다.");
		
	} // end of void main

} // end of class
