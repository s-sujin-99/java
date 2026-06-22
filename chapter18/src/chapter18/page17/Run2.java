package chapter18.page17;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class Run2 {

	public static void main(String[] args) throws IOException {
		//1. inetAddress 생성 
		InetAddress inetAddress1 = InetAddress.getByName("www.google.com");
		//2. port 생성
		int port = 10000;
		
		//3. socket 설졍
		InetSocketAddress isa1 = new InetSocketAddress(port);
		InetSocketAddress isa2 = new InetSocketAddress("www.google.com", port);
		InetSocketAddress isa3 = new InetSocketAddress(inetAddress1, port);
		
		System.out.println(isa1);
		System.out.println(isa2);
		System.out.println(isa3);
		
		// 원하는 정보 가져오기
		System.out.println(isa2.getAddress());
		System.out.println(isa2.getHostName());
		System.out.println(isa2.getHostString());
		System.out.println(isa2.getPort());
		
	}

}
