package chapter17.page38;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// ArrayList & LinkedList 성능차이
		List<Integer> arrayList1 = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// 10만번 추가 add
		System.out.println("====================add====================");
		// arrayList
		long startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			arrayList1.add(0, i);
		}
		long endTime = System.nanoTime();
		System.out.printf("arrayList 10만번 추가했을때 걸리는 시간 : %d\n", endTime - startTime);

		// LinkedList
		long startTime2 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			linkedList.add(0, i);
		}
		long endTime2 = System.nanoTime();
		System.out.printf("linkedList 10만번 추가했을때 걸리는 시간 : %d\n", endTime2 - startTime2);

		// 10만번 탐색 get
		System.out.println("====================get====================");
		// arrayList
		long startTime3 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			arrayList1.get(i);
		}
		long endTime3 = System.nanoTime();
		System.out.printf("arrayList 10만번 가져왔을때 걸리는 시간 : %d\n", endTime3 - startTime3);

		// LinkedList
		long startTime4 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			linkedList.get(i);
		}
		long endTime4 = System.nanoTime();
		System.out.printf("linkedList 10만번 가져왔을때 걸리는 시간 : %d\n", endTime4 - startTime4);

		// 10만번 제거 get
		System.out.println("===================remove==================");
		// arrayList
		long startTime5 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			arrayList1.remove(0);
		}
		long endTime5 = System.nanoTime();
		System.out.printf("arrayList 10만번 삭제할때 걸리는 시간 : %d\n", endTime5 - startTime5);

		// LinkedList
		long startTime6 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			linkedList.remove(0);
		}
		long endTime6 = System.nanoTime();
		System.out.printf("linkedList 10만번 삭제할때 걸리는 시간 : %d\n", endTime6 - startTime6);

	}

}
