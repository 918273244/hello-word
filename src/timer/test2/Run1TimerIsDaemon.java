package timer.test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1TimerIsDaemon {
	private static Timer timer = new Timer(true);
	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			System.out.println("运行了! 时间为 ："+new Date());
		}
		
	}
	
	public static void main(String[] args) {
		try {
			MyTask myTask = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2017-2-18 18:58:22";
			Date dateRef = sdf.parse(dateString);
			System.out.println("字符串时间："+dateRef.toLocaleString()+" 当前时间 "+new Date().toLocaleString());
			timer.schedule(myTask, dateRef);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
