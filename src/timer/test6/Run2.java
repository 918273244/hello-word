package timer.test6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 执行时间早于当前时间  每4秒执行一次
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
			String dateString1 = "2015-10-20 12:23:22";
			Date dateRef1 = sdf.parse(dateString1);

			System.out.println("字符串 1 时间：" + dateRef1.toLocaleString()
					+ " 当前时间 " + new Date().toLocaleString());
			timer.schedule(myTask1, dateRef1,4000);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
