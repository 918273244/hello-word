package timer.test10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * timer.cancel()  不停止计划任务，而是正常执行
 * @author Administrator
 *
 */
public class Run2 {

	static int i = 0;
	

	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			System.out.println("正常执行了 = "+i);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			while(true){
				i++;
				Timer timer = new Timer();
				MyTask task = new MyTask();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = "2015-10-20 12:23:22";
				Date dateRef = sdf.parse(dateString);
				timer.schedule(task, dateRef,4000);
				timer.cancel();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
