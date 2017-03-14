package test.test12;

import test.test12.PublicClass.PrivateClass;

public class Run {

	/**
	 * 内置类与静态内置类
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		PublicClass publicClass = new PublicClass();
		publicClass.setPassword("passwordValue");
		publicClass.setUsername("usernameValue");
		System.out.println(publicClass.getUsername()+"; "+publicClass.getPassword());
		
		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");
		System.out.println(privateClass.getAge()+"; "+privateClass.getAddress());
		
	}
	
}
