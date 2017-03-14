package piped.test2;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {

	public void writeMethod(PipedOutputStream out){
		System.out.println("writ : ");
		try {
		for (int i = 0; i < 300; i++) {
			String outData = ""+(i+1);
				out.write(outData.getBytes());
				System.out.println(outData);
		}
		System.out.println();
		out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
