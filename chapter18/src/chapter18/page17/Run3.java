package chapter18.page17;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

public class Run3 {

	public static void main(String[] args) throws IOException {
		//InetAdress -> 통신하기위해 ip주소 필요
		//1. 도메인주소로 
		InetAddress inetAddress1 = InetAddress.getByName("www.google.com");
		System.out.println(inetAddress1);
		System.out.println("==================================");
		
		byte[] bArr = inetAddress1.getAddress();
		System.out.println(Arrays.toString(bArr));
		System.out.printf("inetAddress1.getHostAddress : %s\n", inetAddress1.getHostAddress());
		System.out.printf("inetAddress1.getHostName : %s\n", inetAddress1.getHostName());
		// 통신시간 확인
		System.out.printf("inetAddress1.isReachable : %b\n", inetAddress1.isReachable(1000));

		System.out.printf("inetAddress1.isLoopbackAddress : %b\n", inetAddress1.isLoopbackAddress());
		
		System.out.printf("inetAddress1.isMulticastAddress : %b\n", inetAddress1.isMulticastAddress());

		
		
	}

}
