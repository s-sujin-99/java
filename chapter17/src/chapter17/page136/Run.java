package chapter17.page136;

import java.util.LinkedList;
import java.util.Queue;


public class Run {

	public static void main(String[] args) {

		// queue
		Queue<Data> queue1 = new LinkedList<Data>();
		
		for (int i = 1; i <= 5; i++) {
			queue1.offer(new Data(i));
		}
		
		System.out.println(queue1);
		
		// peek() 
		System.out.printf("queue1.peek() : %s\n",queue1.peek());
		
		// size()
		System.out.printf("queue1.size() : %d\n",queue1.size());
		
		// poll() : 삭제 => index값이 넘으면 null값 반환
		// remove() => index값이 넘으면 오류가남
		System.out.printf("queue1.poll() : %s\n",queue1.poll());
		System.out.printf("queue1.size() : %d\n",queue1.size());
	
		
	}

}
