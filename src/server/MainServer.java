package server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		try {
			//서버소켓 객체 생성
			ServerSocket s_socket = new ServerSocket(8888);
			
			//대기하다가 클라이언트 요청이 오면 수락(socket을 생성하여 연결)
			Socket c_socket = s_socket.accept();
			
			//클라이언트에게 메세지를 전달하기 위해 OutputStream 생성
			OutputStream os = c_socket.getOutputStream();
			
			//메세지를 스트림으로 보냄
			String sendDataString = "Welcome to MY Server";
			os.write(sendDataString.getBytes());
			
			//사용한 소켓 닫음
			s_socket.close();
			c_socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
