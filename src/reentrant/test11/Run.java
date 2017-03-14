package reentrant.test11;


/**
 * int getHoldCount 查询当前线程保持此锁定的次数  也就是调用lock()方法的次数
 * @author Administrator
 *
 */
public class Run {

	public static void main(String[] args) {
		Service service = new Service();
		service.serviceMethod1();
	}
	
}
