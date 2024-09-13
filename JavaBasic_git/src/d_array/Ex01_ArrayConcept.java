package d_array;

public class Ex01_ArrayConcept {

	public static void main(String[] args) {
		
//		int [] kor = null;	// 배열 선언. 참조형의 초기화는 null값으로 준다.
//		kor = new int[3];	// 배열 객체 생성
//		
//		int [] kor = new int [3];	// 배열 선언 + 배열 객체 생성
//		
//		kor [0] = 100;		// 값 지정
//		kor [1] = 200;
//		kor [2] = 300;
//		
//		// 배열 변수 선언 + 배열 객체 생성 + 값 지정
//		int [] kor = new int[] {100, 200, 300};	
		
		// 위 코드를 간소화
		int [] kor = {100, 200, 300};
		
		int total = 0;		// 총점 구하기
		for (int i = 0; i < kor.length; i++) {
			total += kor[i];
		} // end of for i
		
//		for (int i = 0; i < 4; i++) {	// index 범위를 벗어나는 출력을 요청할 경우 Error 발생
//			total += kor[i];
//		} // end of for i
		
		System.out.println("총점 : " + total);
		
	} // end of void main

} // end of class
