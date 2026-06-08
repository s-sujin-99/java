package chaper07.page10;

import java.util.Arrays;

public class A {
	//멤버 변수
	
	//디생 매생
	
	//set, get
	
	//기능
	
	public A() {
		super();	
	}
	
	//1. 리턴값 x print, 매변 x 안녕출력
	void print() {
		System.out.println("안녕");
	}
	//2. 리턴값 int , 매변 x return : 3
	int data() {
		return 3;
	}
	//3. 리턴값 double , 매변 (int a, double b) return : a+b
	double sum(int a, double b) {
		return a+b;
	}
	//4. 리턴값 x , printMonth 매변 (int m) return : m출력 아니면 다시 입력하세요
	void printMonth(int m) {
		if(m > 12 || m <0) {
			System.out.println("\n다시입력하시오");
			return;
		} else {
			System.out.printf("\n%d월 달입니다.",m);
		}
	}
	
	//정적 멤버 함수 (객체를 만들지 않아도 정적멤버함수를 사용가능)
	public static void staticPrint() {
		System.out.println("정적 멤버 함수야~");
	}
	
	public static double staticSum(int a, double b) {
		return a+b;
	}
	
	public static void intArrayPrint(int[] array) {
		System.out.printf(" %s \n",Arrays.toString(array));
	}
	//출력
}
