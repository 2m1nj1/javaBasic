package c_exercise;

public class CalculatorExpr {

	private int num1 = 0;
	private int num2 = 0;
	
	// getter / setter
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	// end of getter / setter
	
	int getAddtion(){
		int add = num1 + num2;
		return add;
	} // end of getAddtion()
	
	int getSubtraction() {
		int sub = num1 - num2;
		return sub;
	} // end of getSbutraction()
	
	int getMultiplication() {
		int mul = num1 * num2;
		return mul;
	} // end of getMultiplication()
	
	double getDivision() {
		double div = num1 / num2;
		return div;
	} // end of getDivision()
} // end of class
