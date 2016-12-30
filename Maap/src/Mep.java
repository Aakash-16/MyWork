import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Mep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("     Aakash- choudhary,bhopal @ 89         62 7936 3 68","[ -@,]",false);
		
	while (st.hasMoreTokens()){
		
		System.out.println(st.nextToken());
		//System.out.println(st.hasMoreElements());
		
	}
		/*String f = st.nextToken("-");
		System.out.println(f);
		 String fg= st.nextToken(",");
		System.out.println(fg);
		f= st.nextToken("@");
		System.out.println(f);
*/
		/*System.out.println(st.countTokens());
String f = st.nextToken("-");
System.out.println(f);
String fg= st.nextToken(",");
System.out.println(fg);
f= st.nextToken("@");
System.out.println(f);
System.out.println(st.nextToken());
System.out.println(st.nextToken());*/
		
/*String str="Aakash- choudhary,bhopal @ 896 279 36 368";
String string[]=str.split("[-,@]");
for (String string2 : string) {
	System.out.println(string2);
}	*/
		
	
	}
}
