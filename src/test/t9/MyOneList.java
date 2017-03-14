package test.t9;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

	private List list = new ArrayList();
	
	public synchronized void add(String username){
		list.add(username);
	}
	
	public synchronized int getSize(){
		return list.size();
	}
}
