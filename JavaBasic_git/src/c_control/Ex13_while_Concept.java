package c_control;

public class Ex13_while_Concept {

	public static void main(String[] args) {

		int sum = 0;
		
//		for (int i = 0; i <=10; i++) {
//			sum += i;
//		} // end of for i
		
		int i = 1;
		while ( i <=10 ) {
			sum += i;
			i++;
		} // end of while i
		
		System.out.println("sum의 값 : " + sum);
		
	} // end of void main

} // end of class
