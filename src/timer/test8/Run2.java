package timer.test8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 任务执行时被延迟
 * @author Administrator
 *
 */
public class Run2 {

	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			try {
				System.out.println("A 运行了！时间为："+new Date());
				Thread.sleep(5000);
				System.out.println("A 结束了！时间为："+new Date());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2015-10-20 12:23:22";
			Date dateRef = sdf.parse(dateString);
			Timer timer = new Timer();
			System.out.println("字符串 时间：" + dateRef.toLocaleString()
					+ " 当前时间 " + new Date().toLocaleString());
			timer.schedule(task, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
