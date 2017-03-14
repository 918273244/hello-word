package test.syn_Out_asyn;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();
	
	synchronized public void add(String username){
		System.out.println("ThreadName = "+Thread.currentThread().getName()+" 执行add方法");
		list.add(username);
		System.out.println("ThreadName = "+Thread.currentThread().getName()+" 退出add方法");
	}
	
	synchronized public int getSize(){
		System.out.println("ThreadName = "+Thread.currentThread().getName()+" 执行getSize方法");
		int size = list.size();
		System.out.println("ThreadName = "+Thread.currentThread().getName()+" 退出getSize方法");
		return size;
	}
	
}
