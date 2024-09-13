package f_exception;

/*
 * 오류
 * 		- 에러 : 심각한 오류 (ex, 오타로 인해 아예 컴파일이 되지 않는 경우)
 * 		- 예외 : 심각하지 않은 오류 
 * 
 * 예외 처리 : 최정적인 목적은 프로그램이 정상적으로 종료되는 것
 * 		[1] try~catch
 * 			try {
 * 					예외가 발생할 여지가 있는 구문
 * 				} catch (Exception ex) {
 * 					예외가 발생한 후의 구문
 * 				} finally {
 * 					예외 관련 없이 무조건 실행 구문
 * 				}
 * 
 * 		[2] 함수 뒤에 throws
 * 			
 */
public class Ex01_TryCatch {

	public static void main(String[] args) {
		
		String[] str = {"안녕하세요", "올라", "하이"};
		
		try {
			for (int i = 0; i <= str.length; i++) {
				System.out.println(str[i]);
			} // end of for 
			
			// return;
		} catch (Exception ex) {
			// 문제가 있을 때만 실행
			// 정상적일 때는 실행하지 않음
			System.out.println("예외 발생 : " + ex.getMessage());
		} finally {
			// 앞에서 return; 해도 finally는 무조건 실행한다 
			System.out.println("무조건 실행 구문");
		} // end of try
		
		System.out.println("프로그램 종료");
		
	} // end of main

} // end of class
