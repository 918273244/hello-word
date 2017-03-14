package timer.test18;

public class MyObject {

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
