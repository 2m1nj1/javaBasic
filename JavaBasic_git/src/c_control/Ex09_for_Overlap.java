package c_control;

public class Ex09_for_Overlap {

	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			
			for(int k = 0; k < j; k++) {
				System.out.printf(" ");
			}
			
			for (int i = 5; i > j ; i--) {
				System.out.print("*");
			} // end of for (i)
			System.out.println();
		} // end of for(j)
		
	} // end of void main

} // end of class
