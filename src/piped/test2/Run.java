package piped.test2;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

	public static void main(String[] args) {
		try {
			WriteData write = new WriteData();
			ReadData read = new ReadData();
			PipedInputStream input = new PipedInputStream();
			PipedOutputStream out = new PipedOutputStream();
//			out.connect(input);
			input.connect(out);
			ThreadRead tr = new ThreadRead(read, input);
			tr.start();
			
			Thread.sleep(5000);
			
			ThreadWrite tw = new ThreadWrite(write, out);
			tw.start();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
