package chapter18.page17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) throws UnknownHostException {
		//InetAdress -> 통신하기위해 ip주소 필요
		//1. 도메인주소로 
		InetAddress inetAddress1 = InetAddress.getByName("www.google.com");
		System.out.println(inetAddress1);
		
		//2. ipv4 주소로
		InetAddress inetAddress2 = InetAddress.getByAddress(new byte[] {(byte)192, (byte)168, 0, 1});
		System.out.println(inetAddress2);
		
		//3. 도메인이름, 내가정한ip로
		InetAddress inetAddress3 = InetAddress.getByAddress("www.google.com", new byte[] {(byte)192, (byte)168, 0, 1});
		System.out.println(inetAddress3);
		
		//4. localHost로 : 자기 주소
		InetAddress inetAddress4 = InetAddress.getLocalHost();
		System.out.println(inetAddress4);
		
		//5. LopeBackHost : localHost 주소
		InetAddress inetAddress5 = InetAddress.getLoopbackAddress();
		System.out.println(inetAddress5);
		
		//6. IP주소 2개 이상 있는지
		InetAddress[] inetAddress6 = InetAddress.getAllByName("www.google.com");
		for (InetAddress inetAddress : inetAddress6) {
			System.out.println(inetAddress);
		}
		
		
		
		
	}

}
