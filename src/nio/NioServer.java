package nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 *  服务端
 * @author Administrator
 *
 */
public class NioServer {

	//通道管理器
	private Selector selector;
	/**
	 * 获得一个ServerSocket通道，并对该通道做一些初始化的工作
	 */
	public void initServer(int port){
		//获得一个ServerSocket通道  
		try {
			ServerSocketChannel serverChannel = ServerSocketChannel.open();
			//设置通道为非阻塞
			serverChannel.configureBlocking(false);
			//将通道对应的serverSocket绑定到port端口
			serverChannel.socket().bind(new InetSocketAddress(port));
			//获得一个通道管理器
			this.selector = Selector.open();
			//将通道管理器和该通道绑定，并为该通道注册SelectionKey.OP_ACCEPT事件，注册该事件后
			//当该事件到达时，selector.select()，会返回,如果该事件没有到达则一直阻塞在selector.select()
			serverChannel.register(selector, SelectionKey.OP_ACCEPT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 采用轮训的方式监听selector上是否有需要处理的事件，如果有则进行处理
	 */
	public void listen(){
		System.out.println("服务器已经启动成功");
		//轮训selector
		while(true){
			//当注册的事件到达时，方法返回，否则，该方法一直阻塞
			try {
				selector.select();
				//获得selector中选择中项的迭代器，选中的项为注册的事件
				Iterator ite = this.selector.selectedKeys().iterator();
				while(ite.hasNext()){
					SelectionKey key = (SelectionKey) ite.next();
					//删除已选的key，防止重复处理
					ite.remove();
					//客户端请求链接事件
					if(key.isAcceptable()){
						ServerSocketChannel server = (ServerSocketChannel)key.channel();
						//获得客户端链接的通道
						SocketChannel channel = server.accept();
						channel.configureBlocking(false);
						//向客户端发送消息
						channel.write(ByteBuffer.wrap(new String("向客户端发送了一条信息").getBytes()));
						//和客户端链接成功以后，为了可以接收客户端的信息，需要向通道设置读的权限
						channel.register(this.selector, SelectionKey.OP_READ);
					}else if(key.isReadable()){
						//获得可读事件
						read(key);
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	/**
	 * 处理读取客户端发来的事件
	 */
	public void read(SelectionKey key){
		try {
			//服务器可读消息，获得发送事件的channel通道
			SocketChannel channel = (SocketChannel)key.channel();
			//创建读取的缓冲区
			ByteBuffer buffer = ByteBuffer.allocate(10);
			channel.read(buffer);
			byte[] data = buffer.array();
			String msg = new String(data).trim();
			System.out.println("服务端收到信息："+msg);  
			ByteBuffer outBuffer = ByteBuffer.wrap(msg.getBytes());
			channel.write(outBuffer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		NioServer server = new NioServer();
		server.initServer(8080);
		server.listen();
	}
	
}
