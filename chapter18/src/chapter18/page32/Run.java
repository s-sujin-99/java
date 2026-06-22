package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Run {

	public static void main(String[] args) throws IOException {
		System.out.println("<<Server>>");
		ServerSocket serverSocket = new ServerSocket(3000);
		
		System.out.println("...Client 접속 대기..."); //무한 대기
		Socket socket = serverSocket.accept();
		System.out.println("...Client 연결 수락..."); 
		System.out.printf("접속 client 주소 : %s:%d\n",socket.getInetAddress(), socket.getPort());
		
		// client와 대화할수있는 stream생성
		DataInputStream dis = new DataInputStream(new BufferedInputStream((socket.getInputStream())));
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream((socket.getOutputStream())));
		
		// server -> 말하고 바로 보냄
		String sendMessage = "안녕하세요.";
		dos.writeUTF("안녕하세요.");
		System.out.printf("%s",sendMessage);
		dos.flush();
		
		// client 
		String str = dis.readUTF();
		System.out.println("client : " + str);
		
		String sendMessage2 = "주문완료했습니다.";
		dos.writeUTF("주문완료했습니다.");
		System.out.printf("%s",sendMessage2);
		dos.flush();
		
	}

}
