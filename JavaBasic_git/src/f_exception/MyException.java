package f_exception;

public class MyException extends Exception{
	
	public String getMessage() {
		String str = "우리가 매번 실수하는 배열 예외 발생";
		return str;
	}

}
