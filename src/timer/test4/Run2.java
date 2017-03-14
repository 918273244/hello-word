package timer.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2 {
	private static Timer timer = new Timer();
	static public class MyTask extends TimerTask{

		@Override
		public void run() {
			try {
				System.out.println("MyTask begin 运行了! 时间为 ："+new Date());
				Thread.sleep(3000);
				System.out.println("MyTask end 运行了! 时间为 ："+new Date());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	static public class MyTask2 extends TimerTask{
		
		@Override
		public void run() {
			System.out.println("MyTask2 begin! 时间为 ："+new Date());
			System.out.println("MyTask2 运行了! 时间为 ："+new Date());
			System.out.println("MyTask2 end! 时间为 ："+new Date());
		}
		
	}
	
	public static void main(String[] args) {
		try {
			MyTask myTask1 = new MyTask();
			MyTask2 myTask2 = new MyTask2();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString1 = "2016-10-20 12:23:22";
			String dateString2 = "2016-10-20 12:23:24";
			Date dateRef1 = sdf.parse(dateString1);
			Date dateRef2 = sdf.parse(dateString2);
			
			System.out.println("字符串 1 时间："+dateRef1.toLocaleString()+" 当前时间 "+new Date().toLocaleString());
			System.out.println("字符串 1 时间："+dateRef2.toLocaleString()+" 当前时间 "+new Date().toLocaleString());
			timer.schedule(myTask1, dateRef1);
			timer.schedule(myTask2, dateRef2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
