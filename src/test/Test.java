package test;
import java.util.concurrent.*;

public class Test {
    static final private long superSecret = 0XB3415C00L; 
    
    public static void main(String[] args) throws Exception {
    	new Test().test(args);
    }
    
    private void test(String[] args) throws Exception
    {  
    	int size = Integer.parseInt(args[0]);
    	ExecutorService workerpool = Executors.newFixedThreadPool(size);
    
      System.out.println("Start: " + System.currentTimeMillis());
    	
    	for(int i = 0; i < 100; i++)
    	{
    		workerpool.execute(new Worker());
    		
    		// send out every 10ms
    		Thread.sleep(100);
    	}
    }
    
    private class Worker implements Runnable
    {
    	public void run()
    	{
        	int busyTime = 10;  
        	int idleTime = busyTime;  
        	long startTime = 0;
        	int i = 0;
        	  
        	while (i < 50) {  
        	    startTime = System.currentTimeMillis();  
        	    // busy loop  
        	    while ((System.currentTimeMillis() - startTime) <= busyTime)  
        	        ;  
        	    // idle loop  
        	    try {  
        	        Thread.sleep(idleTime);  
        	    } catch (InterruptedException e) {  
        	        System.out.println(e);  
        	    }  
        	    
        	    i ++;
        	} 
        	
        	System.out.println("Finish: " + System.currentTimeMillis());
       }  
    }  
}
