package timer.test19;

import java.io.Serializable;

public class MyObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//内部类方式
	private static class MyObjectHandle{
		private static MyObject myObject = new MyObject();
	}
	
	public MyObject() {
		
	}
	
	public  static MyObject getMyObject(){
		
		return MyObjectHandle.myObject;
	}
	
}
