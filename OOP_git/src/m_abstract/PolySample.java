package m_abstract;

public class PolySample {

	public static void main(String[] args) {
		
		// 출력
		//Object[] result = method();
		Item[] result = method();
		
		for (int i = 0; i < result.length; i++) {
			//((Item) result[i]).output();
			
			result[i].output();
			
			// Object -> Item 형 변환
		} // end of i
		
	} // end of main()

	
//	static Object[] method() {
//		
//		// DATA
//		Book b 	= new Book ("001", "집 가는 방법", "안양출판사", "이민지");
//		Dvd d 	= new Dvd ("002", "집 잘 가는 방법", "이배우", "이감독");
//		Cd	c 	= new Cd();
//		
//		// 모든 class의 최상위 class는 Object
//		Object[] obj = new Object[3];
//		obj[0] = b;
//		obj[1] = d;
//		obj[2] = c;
//		
//		return obj;
//	}
	
	
	static Item[] method() {
		// DATA
		Book b = new Book("001", "집 가는 방법", "안양출판사", "이민지");
		Dvd d = new Dvd("002", "집 잘 가는 방법", "이배우", "이감독");
		Cd c = new Cd();

		// 굳이 최상위 부모 class인 Object가 아닌 부모 class로 해도 충분... 
		// 부모 class로 객체 생성
		Item[] itm = new Item[3];
		itm[0] = b;
		itm[1] = d;
		itm[2] = c;

		return itm;
	} // end of method()
	
} // end of class
