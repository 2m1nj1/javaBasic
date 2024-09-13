package k_inherit_sample;

import java.awt.*;

public class Test {

	Frame f;
	
	Test() {
		f = new Frame("졸리고 춥고 배고파 난 거지야");
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {

		Test t = new Test();
		
	} // end of main()

} // end of class
