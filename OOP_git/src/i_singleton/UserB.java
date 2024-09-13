package i_singleton;

public class UserB {
	
	DBConnect db;
	
	public UserB() {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	} // end of UserB()
	
	public void use() {
		System.out.println("B 작업");
	} // end of use()

} // end of class
