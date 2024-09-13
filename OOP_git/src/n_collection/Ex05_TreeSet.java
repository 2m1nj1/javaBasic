package n_collection;

import java.util.TreeSet;

public class Ex05_TreeSet {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("zebra");
		set.add("bee");
		
		System.out.println(set);
		System.out.println(set.subSet("d", "s")); // d ~ s
		System.out.println(set.headSet("e")); // ~ e
		System.out.println(set.tailSet("e")); // e ~ 
		
	} // end of main()

} // end of class Ex05_TreeSet
