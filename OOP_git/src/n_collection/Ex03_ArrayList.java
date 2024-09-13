package n_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_ArrayList {

	public static void main(String[] args) {

		ArrayList<Student> result = method();
		
		for (Student s: result) {
			System.out.println(s);
		} // end of for
		
		
		System.out.println();
		System.out.println("[참고]------------------------------------");
		// 전체 요소를 순서대로 검색 할 때 : Enumeration (= Iterator)
		Iterator i = result.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		} // end of while
		
	} // end of main()

	
	static ArrayList<Student> method() {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길자", 23)); // 객체를 변수에 생성하고 그 변수를 쓰는 과정을 생략하고, 그냥 바로 넣음
		list.add(new Student("홍길자", 23));
		list.add(new Student("홍길자", 23));
		
		return list;
		
	} // end of method()
	
} // end of class_Ex03ArrayList

class Student {
	String 	name;
	int		age;
	
	Student(String name, int age){
		this.name 	= name;
		this.age 	= age;
	} // end of Student()
	
	public String toString() {
		return name + "님 학생은 " + age + "살 입니다.";
	} // end of toString()
	
} // end of class_Student