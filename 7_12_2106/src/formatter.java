import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;


public class formatter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter(System.out);
		pw=pw.printf("hello guyz i m java and im grown up by %d", 34);
		pw.close();
		
	/*int i = 461012;
		new PrintWriter(System.out).format("The value of i is: %d%n", i);
	*/
		File f = new File ("new.txt");
		f.createNewFile();
PrintWriter p = new PrintWriter(f);
		p.println("aakash");
		//p.close();
	/*	PrintStream ps = new PrintStream(f);
		ps.print(12566.98966556666);*/
	
		
		
		
		
	}

}
