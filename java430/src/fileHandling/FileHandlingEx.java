package fileHandling;
import java.io.*;
public class FileHandlingEx {

	public static void main(String[] args)throws IOException {
		PrintWriter pw=new PrintWriter("D://abc.txt");
			pw.print("hai good morning");
		    pw.println(100);
		    pw.println("Example programm");
		    pw.close();
	}

}
