package timer.test16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 延迟加载
 * @author Administrator
 *
 */
public class Run2 {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		MyThread m3 = new MyThread();
		MyThread m4 = new MyThread();
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		
		
	}
	
	
	
}
