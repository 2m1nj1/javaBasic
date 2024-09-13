package e_Pract01;

public class Product {
	private String productNo = "";
	private String productName = "";
	private int stock = 0;
	
	// setter
	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	// end of setter
	
	public void income (int a) {
		stock += a;
		System.out.println("상품번호 : " + productName + ", 상품명 : " + productName + ", 재고량 : " + stock);
	} // end of income
	
	public void sale (int a) {
		stock -= a;
		System.out.println("상품번호 : " + productName + ", 상품명 : " + productName + ", 재고량 : " + stock);
	} // end of sale
	
	public void output() {
		System.out.println("상품번호 : " + productNo);
		System.out.println("상품명 : " + productName);
		System.out.println("재고량 : " + stock);
	} // end of output
	
} // end of class
