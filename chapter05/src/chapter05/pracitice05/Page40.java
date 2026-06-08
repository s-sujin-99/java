package chapter05.pracitice05;

import java.util.Arrays;

public class Page40 {

	public static void main(String[] args) {
		// 1. 문자열 길이(한글,영문자 상관없이 갯수 판단으로 길이 체크)
		String str1 = new String("hello Java");
		System.out.printf("\"hello  Java\" 문자열길이 = %d \n", str1.length());

		String str2 = new String("안녕하세요 반갑습니다");
		System.out.printf("\"안녕하세요 반갑습니다\" 문자열길이 = %d \n", str2.length());

		// 2. 문자열 검색 charAt( )=> 문자
		System.out.printf("str1.charAt(0) = %c \n", str1.charAt(0));
		System.out.printf("str2.charAt(0) = %c \n", str2.charAt(0));

		// 3. 문자열에서 문자 위치 찾기 indexOf('문자')
		System.out.printf("str1.indexOf('a') = %d \n", str1.indexOf('a'));
		System.out.printf("str1.indexOf('a',1) = %d \n", str1.indexOf('a', 1));

		// 4. 문자열 뒤에서 문자위치 찾기 lastindexOf
		System.out.printf("str1.lastIndexOf('a') = %d \n", str1.lastIndexOf('a'));
		System.out.printf("str1.lastIndexOf('a',8) = %d \n", str1.lastIndexOf('a', 8));

		// 5. 문자열 valueOf( ) 기본형변수(문자,정수,실수,부울형)=> 문자열, 기본형변수 + ""
		System.out.printf("문자 => 문자열 %s \n", String.valueOf('a'));
		System.out.printf("정수 => 문자열 %s \n", String.valueOf(100));
		System.out.printf("실수 => 문자열 %s \n", String.valueOf(100.24));
		System.out.printf("부울형 => 문자열 %s \n", String.valueOf(false));
		System.out.printf("부울형 => 문자열 %s \n", false + "");

		// 6. 문자열 concat() 문자열 + 문자열
		String str3 = "abc";
		System.out.printf("문자 => 문자열 %s \n", str3.concat("def"));
		System.out.printf("문자 => 문자열 %s \n", str3 + ("def"));

		// 7. 문자열을 => byte[]
		String str4 = "hello";
		byte[] str4ByteArray = str4.getBytes();
		// 배열 속에 있는 각각의 요소를 문자열로 바꾸는
		System.out.printf("Arrays.toString(str4ByteArray) %s \n", Arrays.toString(str4ByteArray));

		// 8. 문자열을 => char[]
		String str5 = "안녕하세요";
		char[] str5CharArray = str5.toCharArray();
		// 배열 속에 있는 각각의 요소를 문자열로 바꾸는
		System.out.printf("Arrays.toString(str5CharArray) %s \n", Arrays.toString(str5CharArray));

		// 9. 영문자문자열 => 대문자변경
		String str6 = "abcd";
		System.out.printf(" abcd = %s \n", str6.toUpperCase());

		// 10. 영문자문자열 => 소문자변경
		String str7 = "SHSHSJS";
		System.out.printf(" abcd = %s \n", str7.toLowerCase());

		// 11. 문자열 바꾸는 기능 java => html 변경
		String str8 = "java study";
		System.out.printf("java study = %s \n", str8.replace("java", "html"));

		// 12. 문자열 자르기
		String str9 = "java study";
		System.out.printf("java study = %s \n", str9.substring(4));
		System.out.printf("java study = %s \n", str9.substring(1,4));
		
		// 13. 문자열 split => 문자열[]
		String str10 = "abc/def-ghi jkl";
		String[] str10Array = str10.split("/|-");
		System.out.printf(" %s \n", Arrays.toString(str10Array));
		
		//14. 문자열에서 양쪽에 공백을 제거하는 기능
		String str11 = "      askdf       ";
		System.out.printf(" %s\n", (str11.trim()));
		
		//15. 문자열 비교
		String str12 ="abc";
		String str13 = new String("abc");
		System.out.printf(" %b\n", str12 == str13);
		System.out.printf(" %b\n", str12.equals(str13));
		System.out.printf(" %b\n", str12.equalsIgnoreCase(str13));
		
		//16. 구분선을 작성할 때 쉬운 방법
		System.out.printf(" %s \n", "*".repeat(20));
		
		

	}
}