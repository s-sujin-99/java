package chapter07.page18;

public class ClassRun {

	public static void main(String[] args) {
		// 가변형 길이 매개변수 설정
		// 정수형 int[] a = new int[] {1,2};
		method1(new int[] {1,2});
		
		int[] a = new int[] {11,12};
		method1(a);
		
		method2(22,33);
		
		method2(a);

		method2(new int[] {44,55});
		
		method3("원숭이", "하마", "코끼리", "사자");

		method3(new String[] {"원숭이", "하마", "코끼리"});
	}

	public static void method1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("메소드 1 번 : %5d\n",a[i]);
		}
		System.out.println("================");
	}

	public static void method2(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("메소드 2 번 : %5d\n",a[i]);
		}
		System.out.println("================");
	}
	
	public static void method3(String... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("메소드 3 번 : %-10s\n",a[i]);
		}
		System.out.println("================");
	}
}
