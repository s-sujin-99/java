package chapter13.test01;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {

		int[] ia = new int[] { 7, 6, 9, 1, 4 };
		System.out.println(Arrays.toString(ia));

		// 내림차순
		for (int j = 0; j < ia.length - 1; j++) {

			for (int i = j; i < ia.length; i++) {
				if (ia[j] < ia[i]) {
					int buffer = ia[j];
					ia[j] = ia[i];
					ia[i] = buffer;
				}
			}
		}
		System.out.println(Arrays.toString(ia));

		// 오름차순
		for (int j = 0; j < ia.length - 1; j++) {

			for (int i = j; i < ia.length; i++) {
				if (ia[j] > ia[i]) {
					int buffer = ia[j];
					ia[j] = ia[i];
					ia[i] = buffer;
				}
			}
		}
		System.out.println(Arrays.toString(ia));
	}

}
