package socket.io.test2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer {

	public static void main(String[] args) {
		int port = 8080;
		ServerSocket server = null;
		try{
			server = new ServerSocket(port);
			System.out.println("the time server is start in port : "+port);
			Socket socket = null;
			//创建I/O任务线程
			TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(50, 1000);
			while(true){
				socket = server.accept();
				singleExecutor.execute(new TimeServerHandler(socket));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(server != null){
				System.out.println("the time server close");
				try {
					server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				server = null;
			}
		}
	}
	
}
