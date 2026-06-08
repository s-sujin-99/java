package chapter05.pracitice05;

public class paga11Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ia = new int[3];
		for (int i = 0; i < ia.length; i++) {
			ia[i] = (i+1)*10;
			System.out.println(ia[i]);
		}
		for (int i : ia) {
			System.out.println(i);
		}
	}

}
