package chapter17.page06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		// 배열 & 리스트 비교
		// 배열 크기 낭비, 리스트 낭비없음
		String[] array = {"가","나","다","라","마","바","사"};
		for (String string : array) {
			System.out.printf("%s ",string);
		}
		System.out.println();
		// 배열을 크기변경, 삭제변경, 추가변경 불가, 수정만 가능
		array[0] = null;
		array[1] = null;
		for (String string : array) {
			System.out.printf("%s ",string);
		} // end of array
		
		System.out.printf("\n배열의 크기 : %d\n", array.length);
		System.out.println("array : " + Arrays.toString(array) + " kdj");
		System.out.println();
		
		ArrayList<Book> arrayList = new ArrayList<Book>();
		arrayList.add(new Book());
		arrayList.add(new Book());
		arrayList.add(new Book());
		arrayList.add(new Book());
		arrayList.add(new Book());
		
		
		for (Book string : arrayList) {
			System.out.printf("%s ", string);
		} 
		System.out.printf("\nList의 크기 : %d\n", arrayList.size());
		
		arrayList.remove(1);
		arrayList.remove(2);
		
		System.out.println();
		for (Book string : arrayList) {
			System.out.printf("%s ", string);
		} // end of ArrayList
		System.out.printf("\nList의 크기 : %d\n", arrayList.size());
		System.out.println(arrayList + " kdj");
		
		
	}
}
