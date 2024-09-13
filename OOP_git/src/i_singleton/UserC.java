package i_singleton;

public class UserC {
	
	DBConnect db;
	
	public UserC() {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	} // end of UserC()
	
	public void use() {
		System.out.println("C 작업");
	} // end of use()

} // end of class
