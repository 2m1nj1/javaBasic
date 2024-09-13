package n_collection;

/*
 * 자료구조 기초
 * 
 * 		Stack : LIFO ( Last In First Out )
 * 				나중에 들어온 데이터가 먼저 나가는 구조
 * 
 * 		Queue : FIFO ( First In First Out)
 * 				먼저 들어온 데이터가 먼저 나가는 구조
 * 
 */

import java.util.*;

public class Ex08_StackQueue {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println("스택에서 데이터 꺼내기");
		
		while(!stack.empty()) {
			System.out.println( stack.pop() );
		} // end of while
		/*
		 * [ Console - Stack ]
		 * 스택에서 데이터 꺼내기
		 * C
		 * B
		 * A
		 */
		
		
		// Queue 는 Interface라서 객체 생성 불가능
		// Queue queue = new Queue(); // Error!
		Queue queue = new LinkedList();
		queue.offer("간");
		queue.offer("나");
		queue.offer("다");
		
		System.out.println("큐에서 데이터 꺼내기");
		
		while(!queue.isEmpty()) {
			System.out.println( queue.poll() );
		} // end of while
		/*
		 * [ Console - Queue ]
		 * 큐에서 데이터 꺼내기
		 * 가
		 * 나
		 * 다
		 */
		
		
	} // end of main()

} // end of class
