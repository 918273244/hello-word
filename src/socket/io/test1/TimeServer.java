package socket.io.test1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer {

	public static void main(String[] args) {
		int port = 8080;
		if(args != null && args.length>0){
			try{
				port = Integer.parseInt(args[0]);
			}catch(NumberFormatException b){
				b.printStackTrace();
			}
		}
		
		ServerSocket server = null;
		try{
			server = new ServerSocket(port);
			System.out.println("the time server is start in port "+port);
			Socket socket = null;
			while(true){
				socket = server.accept();
				new Thread(new TimeServerHandler(socket));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(server != null){
				System.out.println("The time server close");
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
