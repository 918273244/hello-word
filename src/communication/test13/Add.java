package communication.test13;

import java.util.ArrayList;
import java.util.List;

import com.sun.beans.decoder.ValueObject;


public class Add {

	public static List list = new ArrayList();
	
	//加法
	private String lock;
	public Add(String lock) {
		this.lock = lock;
	}
	
	public void add(){
		synchronized (lock) {
			list.add("a");
			lock.notifyAll();
		}
		
	}
	
}
