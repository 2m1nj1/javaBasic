package c_control;

public class Ex17_Pract {

	public static void main(String[] args) {
		
		int stNum = 8;
		int cnt = 0;
		
		for (int i = 0; i < 10000; i++) {
			int num = i;
			
			while (num != 0) {
				int remain = num%10;
				
				if (remain == stNum) {
					cnt++;
				} // end of if remain
				
				num = num/10;
				
			} // end of while num
			
		} // end of for i
		
		System.out.println(cnt);
		
	} // end of void main
	

} // end of class
