import java.util.Scanner;


public class Lamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner("aakash choudhary,bhopal,123");
		kb.useDelimiter("[ ,]");
		while (kb.hasNext()){
			System.out.println(kb.next());
			
		}

	}

}
