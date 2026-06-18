package chapter17.page131;

import java.util.Stack;

public class Run {

	public static void main(String[] args) {
		// Stack 컬플
		Stack<Data> st = new Stack<Data>();
		
		// push
		st.push(new Data(1));
		st.push(new Data(5));
		st.push(new Data(9));
		st.push(new Data(3));
		
		System.out.println(st);

		
		// peek() 제일 위에 값 확인
		System.out.printf("st.peek() : %s\n", st.peek());
		
		// size()
		System.out.printf("st.size() : %s\n", st.size());
		
		// search() : 비교
		System.out.printf("st.search(new Data(9)) : %s\n", st.search(new Data(9)));
		
		// pop() : 제일 위에 값 삭제
		System.out.printf("st.pop() : %s\n", st.pop());
		System.out.printf("pop()후 st.size() : %s\n", st.size());
		
		// isEmpty() : 비어있는가
		System.out.printf("st.isEmpty() : %s\n", st.isEmpty());
		
		
	}

}
