import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Defaulttee {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("new.txt"));
		String Name = "AAKASH CHOUDHARY";
		String Topic_Name = " GREEN";
		String str ;
		while ((str=br.readLine())!=null){
			
			
			//System.out.println(str.contains("<Name"));
			if(str.contains("<Name>")){
		str=	 str.replaceAll("<Name>", Name);
		
			}
			if(str.contains("<Topic Name>")){
				str=	 str.replaceAll("<Topic Name>", Topic_Name);
				
					}
			System.out.println(str);
		}
		

	}

}
