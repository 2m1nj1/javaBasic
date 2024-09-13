package n_collection;

public class Ex09_Generics {

	public static void main(String[] args) {
		
		MyType<String, String> 	name 	= new MyType("이름", "이민지");
		MyType<String, Integer> age 	= new MyType("나이", new Integer(44));
		MyType<String, Double> 	height 	= new MyType("키", new Double(130.99));
		
		System.out.println(name.getKey() + " / " + name.getValue());
		System.out.println(age.getKey() + " / " + age.getValue());
		System.out.println(height.getKey() + " / " + height.getValue());
		
	} // end of main()

} // end of class Ex09_Generics

class MyType<K, V> {
	K key;
	V value;
	
	public MyType(K key, V value) {
		this.key = key;
		this.value = value;
	} // end of MyType()
	
	
	K getKey() {
		return key;
	} // end of getKey()
	
	V getValue() {
		return value;
	} // end of getValue()
	
	
} // end of class MyType
