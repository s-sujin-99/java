package chapter05.pracitice05;

public class Page35Text {

	public static void main(String[] args) {
		//문자열객체를 생성한다.
		String str1 = new String("안녕");
		System.out.printf("str1 = %s \n", str1);
		System.out.printf("str1 주소 = %d \n", System.identityHashCode(str1));
		
		String str2 = new String("안녕");
		System.out.printf("str2 = %s \n", str2);
		System.out.printf("str2주소 = %d \n", System.identityHashCode(str2));
		
		// 두 객체의 번지를 비교하면 나오는 결과값?
		System.out.printf("str1 == str2 == %b /n", str1 == str2);
		
		String s3 = "안녕";
		System.out.printf("s3주소 = %d \n", System.identityHashCode(s3));
		
		String s4 = "안녕";
		System.out.printf("s4주소 = %d \n", System.identityHashCode(s4));


	}

}
