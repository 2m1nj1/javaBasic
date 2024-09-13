package f_exception;

public class Ex04_Throw {

	public static void main(String[] args) {
		
		try {
			readMessage();
		} catch (Exception ex) {
			System.out.println("실패 : " + ex.getMessage());
		}
		
		System.out.println("프로그램 종료");
	} // end of main()

	static void readMessage() throws Exception {
		String[] str = {"안녕하세요", "올라", "하이"};
		
		try {
			for (int i = 0; i <= str.length; i++) {
				System.out.println(str[i]);
			} // end of for 
		} catch(Exception ex) {
			// throw : 일부러 예외를 발생 시킴
			throw new MyException();
		} // end of try
	} // end of readMessage()
} // end of class
