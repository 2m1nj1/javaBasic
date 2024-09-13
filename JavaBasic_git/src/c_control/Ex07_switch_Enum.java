package c_control;


enum Size{
	SMALL,
	MEDIUM,
	LARGE
}

public class Ex07_switch_Enum {

	public static void main(String[] args) {
		
		/*
		 * small : 1, medium : 2, large : 3 으로 프로그램 처리
		 */
		
		Size size = Size.SMALL;

		switch(size) {
		case SMALL: System.out.println("작은 거"); break;
		case MEDIUM: System.out.println("중간 거"); break;
		case LARGE: System.out.println("큰 거"); break;
		}
		
		
//		int size = 1; // 화면에서 넘어오는 값 상상하가ㅣ
//		
//		switch(size) {
//		case 1: System.out.println("작은 거"); break;
//		case 2: System.out.println("중간 거"); break;
//		case 3: System.out.println("큰 거"); break;
//		}

	}

}
