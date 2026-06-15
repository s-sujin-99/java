package chapter16.page07;

public class Run {

	public static void main(String[] args) {
		MyClass<String> class1 = new MyClass<String>();
		class1.setT("안녕");
		System.out.println(class1.getT());
		
		MyClass<Integer> class2 = new MyClass<Integer>();
		class2.setT(100);
		System.out.println(class2.getT());

	}

}
