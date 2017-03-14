package timer.test16;

public class MyObject {

	private static MyObject myObject = new MyObject();
	
	public MyObject() {
		
	}
	
	public synchronized static MyObject getMyObject(){
		if(myObject != null){
		}else{
			try {
				Thread.sleep(3000);
				myObject = new MyObject();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return myObject;
	}
	
}
