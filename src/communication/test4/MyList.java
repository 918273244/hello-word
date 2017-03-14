package communication.test4;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private static List list = new ArrayList();
	
	public static void add(){
		list.add("a");
	}
	
	public static int getSize(){
		return list.size();
	}
	
}
