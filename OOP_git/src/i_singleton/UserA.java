package i_singleton;

public class UserA {
	
	DBConnect db;
	
	public UserA() {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	} // end of UserA()
	
	public void use() {
		System.out.println("A 작업");
	} // end of use()

} // end of class
