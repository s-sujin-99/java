package chaper07.page10;


public class ATest {

	public static void main(String[] args) {
		// 객체 생성
		A a = new A();
		
		// 출력
		a.print();
		
		int num = a.data();
		System.out.printf("num = %d\n",num);
		
		double value = a.sum(10, 20.45);
		System.out.printf("value = %.2f\n",value);
		
		a.printMonth(10);
		a.printMonth(13);
		
		A.staticPrint();
		a.staticPrint();
		
		double value2 = A.staticSum(20, 20.23);
		System.out.printf("value2 = %.2f\n", value2);
		
		System.out.println("======================");
		int[] array;
		array = new int[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = (i+1)*10;
		}
//		System.out.printf(" %s \n",Arrays.toString(array));
		A.intArrayPrint(new int[3]);
		
		int[] array2;
		array2 = new int[] {11,21,31};
//		System.out.printf(" %s \n",Arrays.toString(array2));
		A.intArrayPrint(new int[] {11,21,31});
		
		int[] array3 = {12,22,32};
//		System.out.printf(" %s \n",Arrays.toString(array3));
		A.intArrayPrint(array3);
				
	}

}
