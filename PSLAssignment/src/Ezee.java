import java.util.Scanner;


public class Ezee {

	public static void main(String[] args) {
		String arr[] = initProductName();
		for (String string : arr) {
			System.out.println(string);
		}
		System.out.println("Enter the keyword uh want to match");

		Scanner kb = new Scanner(System.in);
	   String kw = 	kb.nextLine();
    System.out.println(  isPresent(arr, kw));

	}

	static String[] initProductName(){
		int ds= 4;
		String s[] = new String [ds];
		int flag = 0;
		String temp2= null;
		Scanner kb = new Scanner(System.in);

		for(int i =0 ;;i++){


			if (i ==(ds-1)){
				int temp1 = ds;
				ds= ds*2;
				String temp[] = new String [ds] ;
				for(int x=0;x<temp1-1;x++){
					temp[x] = s[x];
				}
				s=temp;
			}

			s[i]= kb.nextLine();


			if(s[i].equals("")){
				String temp[] = new String[i+1];
				for(int x=0;x<i+1;x++){
					temp[x] = s[x];
				}
				return temp;
			}



		}

  }


	


	static boolean isPresent (String [] pn , String kw){
		
		
		if(kw.equalsIgnoreCase("")){
			return false;
		}
		for(int i =0;i<pn.length;i++){
			
		 if (kw.equalsIgnoreCase(pn[i])){
			 return true;
		 }
		}
	return false;	
    
	}

}
