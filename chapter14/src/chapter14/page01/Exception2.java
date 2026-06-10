package chapter14.page01;

import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {

	public static void main(String[] args) {
		// checked Exception -> InterruptedException
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// checked Exception -> ClassNotFoundException
		try {
			Class cls = Class.forName("java.lang.Object");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// checked Exception -> IOException
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			isr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
