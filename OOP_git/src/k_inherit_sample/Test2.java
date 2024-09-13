package k_inherit_sample;

import java.awt.*;

// 상속
public class Test2 extends Frame {
	
	Test2() {
		// 상속 설정 시 부모 클래스인 Frame 클래스 내에 있는 함수 사용 가능
		super("집가고싶은데");
		setBounds(100, 100, 500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Test2 t = new Test2();
	}

}
