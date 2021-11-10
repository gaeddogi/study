package client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		try {
			System.out.println("클라이언트임");
			//소켓 생성하여 해당 서버로 연결시도(서버ip, 포트번호)
			Socket c_socket = new Socket("192.168.219.106", 8888);
			
			//메세지 받을 inputStream 생성
			InputStream is = c_socket.getInputStream();
			byte[] receiveBuffer = new byte[100];
			is.read(receiveBuffer);
			
			System.out.println(new String(receiveBuffer));
			//소켓 닫음
			c_socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
