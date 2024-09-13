package c_control;

public class Ex02_if_PhNum {

	public static void main(String[] args) {
		
		String tel = "02-234-567";
		/*
		 * 전화번호는 앞자리가 031 0505 등 다양하기 때문에
		 * 하이픈(-)을 기준으로 데이터를 끊어내야함
		 */
		
		int idx = tel.indexOf('-'); // 첫번째 하이픈의 위치를 변수 idx에 대입
		// System.out.println(idx); // 2 
		
		String localNum = tel.substring(0, idx); // 문자열 tel의 0번째 부터 idx까지의 값을 변수 localNum에 저장
		// System.out.println(localNum);
		String local = "";
		
		if (localNum.equals("02")) {
			//System.out.println("서울");
			local = "서울";
		} else if (localNum.equals("032")) {
			// System.out.println("인천");
			local = "인천";
		} else {
			// System.out.println("한국");
			local = "한국";
		}
		
		System.out.println(local + " 입니다.");
	}

}
