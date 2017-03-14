package test.t9;

public class Myservice {

	public MyOneList addServiceMethod(MyOneList list, String data){
		try {
			synchronized (list) {
				if(list.getSize()<1){
					Thread.sleep(2000);//摸你从远程读取数据话费2秒
					list.add(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
