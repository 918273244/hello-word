package communication.test1;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();
	public void add(){
		list.add("One");
	}
	
	public int getSize(){
		return list.size();
	}
	
	
}
