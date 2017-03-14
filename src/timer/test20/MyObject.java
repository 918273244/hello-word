package timer.test20;

import java.sql.Connection;

public enum MyObject {

	connectionFactory;
	private Connection connection;
	private MyObject(){
		System.out.println("myObject 构造方法");
		
	}
	
	public Connection getConnection(){
		System.out.println("获得 connection");
		return connection;
	}
	
}
