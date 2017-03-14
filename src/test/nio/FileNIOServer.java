package test.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.HashMap;
import java.util.Map;

public class FileNIOServer {

	/**
	 * http://www.cnblogs.com/qhyuan1992/p/5385275.html
	 */
	
	private ByteBuffer buffer = ByteBuffer.allocate(1024*1024);
	
    //使用Map保存每个连接，当OP_READ就绪时，根据key找到对应的文件对其进行写入。若将其封装成一个类，作为值保存，可以再上传过程中显示进度等等  
	Map<SelectionKey, FileChannel> fileMap = new HashMap<SelectionKey, FileChannel>();  
	
	public void startServer() throws IOException{
		Selector selector = Selector.open();
		
	}
	
}
