package timer.test7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * cancel将自身移除
 * @author Administrator
 *
 */
public class Run2 {

	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			System.out.println("A 运行了！时间为："+new Date());
			this.cancel();
		}
		
	}
	static public class MyTaskB extends TimerTask{
		
		@Override
		public void run() {
			System.out.println("B 运行了！时间为："+new Date());
		}
		
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			MyTaskB taskb = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2015-10-20 12:23:22";
			Date dateRef = sdf.parse(dateString);
			Timer timer = new Timer();
			System.out.println("字符串 时间：" + dateRef.toLocaleString()
					+ " 当前时间 " + new Date().toLocaleString());
			timer.schedule(task, dateRef,4000);
			timer.schedule(taskb, dateRef,4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
