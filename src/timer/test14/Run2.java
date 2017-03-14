package timer.test14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer scheduleAtFixedRate方法任务延时
 * @author Administrator
 *
 */
public class Run2 {

	private static Timer timer = new Timer();
	private static int runCount = 0;

	static public class MyTask extends TimerTask{
		
		@Override
		public void run() {
			try {
				System.out.println("1 begin 运行了！时间 为： "+new Date());
				Thread.sleep(5000);
				System.out.println("1 end 运行了！时间为："+new Date());
				runCount++;
				if(runCount == 5){
					timer.cancel();
				}
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
			System.out.println("字符串 1 时间："+dateRef.toLocaleString()+" 当前时间: "+new Date().toLocaleString());
			timer.scheduleAtFixedRate(task, dateRef,2000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
