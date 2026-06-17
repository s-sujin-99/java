package chapter17.page09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Run {

	public static void main(String[] args) {
		// List -> ArrayList, Vector, LinkedList
		// size() -> 10개 확보 -> 생성자 갯수를 입력 가능
		// LinkedList : 구조때문에 사이즈를 잡아놓고 사용하는것이 아님
		
		List<String> list1 = new ArrayList<String>(50);
		List<String> list2 = new Vector<String>(50);
//		List<String> list3 = new LinkedList<String>(50);
		// =============================================
		
		// Arrays.asList()
		List<Integer> integers1 = Arrays.asList(1,2,3,4); // 매개변수 갯수에 상관없이 입력가능
		integers1.set(1, null);
//		integers1.add(3);
//		integers1.remove(0);
		for (Integer integer : integers1) {
			System.out.println(integer);
		}

		// =============================================
		// List 전체 삭제
		list1.add("가");
		list1.add("나");
		list1.add("다");
		list1.add("라");
		
		System.out.println("list1.add() : " +list1);
		System.out.println();
		list1.clear();
		
		System.out.println("list1.clear() : " + list1);
		
		//isEmtpy
		if (list1.isEmpty()) {
			System.out.printf("arrayList 자료가 없습니다. 사이즈 : %d\n",list1.isEmpty());
		}
				
		List<String> list4 = new ArrayList<String>();
		list4.add("가");
		list4.add("나");
		list4.add("다");
		list4.add("라");
		list4.add("마");
		
		String[] oArray = list4.toArray(new String[0]);
		for (String string : oArray) {
			System.out.println(string);
		}
		
	}

}
