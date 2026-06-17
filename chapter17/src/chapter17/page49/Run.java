package chapter17.page49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// List == Set 똑같다. (get()만 없음)
		// Set 중복 불가 => equals, hashCode 오버라이딩 필수적
		// TreeSet 정렬, 검색 특화 => comparable 구현
		Set<Date> set1 = new HashSet<>();
		System.out.println("=========add==========");
		set1.add(new Date(1, "가"));
		set1.add(new Date(1, "나"));
		set1.add(new Date(1, "다"));
		set1.add(new Date(1, "라"));
		set1.add(new Date(1, "라"));
		
		System.out.println(set1.toString());
		
		// 삭제
		System.out.println("=========remove==========");
		set1.remove(new Date(1, "가"));
		System.out.println(set1.toString());

		// 가져오기
		System.out.println("==========get===========");
		for (Date date : set1) {
			System.out.println(date);
		}
		
		// clear()
		System.out.println("==========clear===========");
		set1.clear();
		System.out.printf("set1.clear() : %s\n", set1.toString());
	
		// isEmpty
		System.out.println("==========isEmpty===========");
		System.out.printf("set1.isEmpty() : %s\n", set1.isEmpty());

		// contains 
		System.out.println("==========contains===========");
		set1.add(new Date(1, "가"));
		set1.add(new Date(1, "나"));
		set1.add(new Date(1, "다"));
		System.out.printf("new Date(1, '가') contains : %b \n",set1.contains(new Date(1, "가")));
		System.out.printf("new Date(1, '다') contains : %b \n",set1.contains(new Date(1, "다")));
	
		// size
		System.out.println("==========size===========");
		System.out.printf("size : %d \n",set1.size());
		
		//iterator
		System.out.println("==========iterator===========");
		Iterator<Date> iterator = set1.iterator();
		//set 속에 객체가 있으면 true, 없으면 false
		while (iterator.hasNext()) {
			Date date = iterator.next();
			System.out.println(date);
		}
		
		// for each문으로 set 속 객체 출력
		System.out.println("==========for each===========");
		for (Date date : set1) {
			System.out.println(date.toString());
		}
		
		
	}

}
