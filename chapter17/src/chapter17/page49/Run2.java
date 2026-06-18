package chapter17.page49;

import java.util.SortedSet;
import java.util.TreeSet;

public class Run2 {

	public static void main(String[] args) {
		// TreeSet : 중복 허용안됨 hashcode, equals, 대소크기 정해야함
		TreeSet<Data2> treeSet1 = new TreeSet<Data2>();

		for (int i = 1; i <= 20; i++) {
			int value = (int) (Math.random() * (20 - 1 + 1) + 1);
			System.out.printf("%3d", value);
			treeSet1.add(new Data2(value));
		}
		// 출력
		System.out.println("\n=========================");
		System.out.printf("size() : %d\n", treeSet1.size());
		System.out.println(treeSet1);

		// 가장 작은값
		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("first() : %s\n", treeSet1.first());
		System.out.printf("size() : %d\n", treeSet1.size());
		// first랑 차이점 : 삭제 가능
		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("pollFirst() : %s\n", treeSet1.pollFirst());
		System.out.printf("size() : %d\n", treeSet1.size());

		// 가장 큰값
		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("last() : %s\n", treeSet1.last());
		System.out.printf("size() : %d\n", treeSet1.size());

		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("pollLast() : %s\n", treeSet1.pollLast());
		System.out.printf("size() : %d\n", treeSet1.size());

		// lower
		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("lower(new Data2(10)) : %s\n", treeSet1.lower(new Data2(10)));

		// higher
		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("higher(new Data2(10)) : %s\n", treeSet1.higher(new Data2(10)));

		// floor
		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("floor(new Data2(10)) : %s\n", treeSet1.floor(new Data2(10)));
		
		// ceiling
		System.out.println("\n=========================");
		System.out.println(treeSet1);
		System.out.printf("ceiling(new Data2(10)) : %s\n", treeSet1.ceiling(new Data2(10)));

		// headSet(E), headSet(E,false)
		System.out.println("\n=========================");
		SortedSet<Data2> ss1 = treeSet1.headSet(new Data2(10), true);
		System.out.printf("headSet(new Data2(10)) : %s", ss1);
		
		// tailSet(E) tailSet(E, false)
		System.out.println("\n=========================");
		SortedSet<Data2> ss2 = treeSet1.tailSet(new Data2(10), false);
		System.out.printf("tailSet(new Data2(10)) : %s", ss2);
		
		// subSet(E1, E2)
		System.out.println("\n=========================");
		SortedSet<Data2> ss3 = treeSet1.subSet(new Data2(5), true, new Data2(15), true);
		System.out.printf("subSet(new Data2(5), new Data2(15)) : %s", ss3);
		
		// descendingSet() 기본 = 오름차순 -> 내림차순
		System.out.println("\n=========================");
		SortedSet<Data2> ss4 = treeSet1.descendingSet();
		System.out.printf("treeSet1.descendingSet() : %s", ss4);

	}

}
