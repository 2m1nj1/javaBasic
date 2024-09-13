package f_exception;

import java.io.FileInputStream;

public class Ex03_Throws {

	public static void main(String[] args) {
		
		try {
			readFile();
			System.err.println("파일 처리 성공");
		} catch(Exception ex) {
			System.out.println("예외 발생 : " + ex.getMessage());
			// ex.printStackTrace();
		} // end of try
		
	} // end of main
	
	static void readFile() throws Exception {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("happy.txt");
		} finally {
			fis.close(); // throws Exception 덕분에 이부분 try catch 안해도 됨
		} //end of try
	} // end of readFile()
} // end of class
