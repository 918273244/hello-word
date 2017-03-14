package timer.test17;

public class MyObject {

	private static MyObject myObject = new MyObject();
	
	public MyObject() {
		
	}
	
	public  static MyObject getMyObject(){
		if(myObject != null){
		}else{
			try {
				Thread.sleep(3000);
				synchronized(MyObject.class){
					if(myObject == null){
						myObject = new MyObject();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return myObject;
	}
	
}
