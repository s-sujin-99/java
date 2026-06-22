package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientRun {

	public static void main(String[] args) throws IOException {
		System.out.println("<<Client>>");
		Socket clientSocket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)9}),3000);
		
		System.out.println("...Server 연결 수락..."); 
		System.out.printf("접속 Server 주소 : %s:%d\n",clientSocket.getInetAddress(), clientSocket.getPort());
		
		// client와 대화할수있는 stream생성
		DataInputStream dis = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));
		
		// server
		String receviMessage = dis.readUTF();
		System.out.printf("server : %s\n",receviMessage);
		
		// client
		dos.writeUTF("연어회요.");
		dos.flush();
		
		// server
		String receviMessage2 = dis.readUTF();
		System.out.printf("server : %s\n",receviMessage2);
		

	}

}
