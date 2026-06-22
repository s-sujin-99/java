package chapter18.page41;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientSide {

	public static void main(String[] args) throws IOException {
		System.out.println("<<Client>>");
		Socket socket = null;
		// 1. 서버 접속요청 (서버주소, 포트번호) -> 서버와 통신할수 있는 모든 정보를 가지고있음
//		socket = new Socket(InetAddress.getByName("localhost"), 3000);
		socket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)89}), 3000);

		// 2. ServerSocket 가지고 송,수신기 생성
		// OutputStream(입), InputStream(귀)
		System.out.println("Server 접속 완료\n");
		System.out.printf("접속 server 주소 : %s:%d\n", socket.getInetAddress(), socket.getPort());

		// 1byte에서 2byte로 전환
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(socket.getInputStream()));
		// 2byte에서 1byte로 전환
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(socket.getOutputStream()));

		//3. 파일 이름 결정후 전송
		File file = new File("src/chapter18/page41/dog.jpg");
		//4. 파일을 보낼려면 파일통역사 필요
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(file));
		
		System.out.printf("파일이름 : %s\n",file.getName());
		//5. 파일명 전송
		dos.writeUTF(file.getName());
		dos.flush();
		
		//6. server 파일 전체 사이즈와 이미지를 byte[]로 전송
		//byte 크기 정함
		byte[] data = new byte[1024];
		int len = 0;
		//이미지 크기만큼 가져올때까지 반복문 (-1 : 더이상 크기가 없을때)
		while ((len = bis.read(data)) != -1) {
			dos.writeInt(len);
			dos.write(len);
			dos.flush();
		}
		dos.writeInt(-1);
		dos.flush();
		
		String str = dis.readUTF();
		System.out.println(str);
		
		System.out.println("clientSocker 종료");
	}

}
