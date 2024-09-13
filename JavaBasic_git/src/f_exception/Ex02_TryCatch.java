package f_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02_TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("abc.txt");
			fis.read(); // 파일 읽기
			System.out.println("파일 처리");
		} catch (FileNotFoundException ex) {
			// 구체적인 예외를 위 쪽으로 
			System.out.println("파일이 존재하지 않는 예외 발생 : " + ex.getMessage());
			// ex.printStackTrace();
		} catch (Exception ex) {
			// catch를 여러개 사용해도 ㄱㅊ
			System.out.println("예외 발생 : " + ex.getMessage());
			// ex.printStackTrace(); // 
		} finally {
			try {
				fis.close(); // 통로를 열면 반드시 닫아야 된다.
			} catch (IOException e) {
				e.printStackTrace();
			} // end of try
		} // end of try
		
	} // end of main()

} // end of class
