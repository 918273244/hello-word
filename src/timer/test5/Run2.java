package timer.test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 执行时间晚于当前时间  每4秒执行一次
 * @author Administrator
 *
 */
public class Run2 {
	private static Timer timer = new Timer();

	static public class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("MyTask 运行了! 时间为 ：" + new Date());
		}

	}


	public static void main(String[] args) {
		try {
			MyTask myTask1 = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2017-02-18 22:10:34";
			String dateString2 = "2016-10-20 12:23:24";
			Date dateRef1 = sdf.parse(dateString1);
			Date dateRef2 = sdf.parse(dateString2);

			System.out.println("字符串 1 时间：" + dateRef1.toLocaleString()
					+ " 当前时间 " + new Date().toLocaleString());
			timer.schedule(myTask1, dateRef1,4000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
