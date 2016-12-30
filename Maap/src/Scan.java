import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Scan {
public static void main(String[] args) {
	/*Scanner sc=new Scanner("Aakash- choudhary,bhopal @ 8962 7936 3 68");
	sc.useDelimiter(Pattern.compile("[ ,@-]"));
	while(sc.hasNext())
		System.out.println(sc.next());*/
Pattern pat=Pattern.compile("[-, @]+");
	/*Matcher mat=pat.matcher("Aakash- choudhary,bhopal @ 8962 7936 3 68");
	while (mat.find()){
		System.out.println(mat.group());
	}*/
	String s[] = pat.split(" Aakash- choudhary ,b hopal @89    627 936 368");
	for (String string : s) {
		System.out.println(string);
	}
	
	/*String s[] = " Aakash- choudhary ,b hopal @89    627 936 368".split("[ ,-@]+");
	for (String string : s) {
		System.out.println(string);
	}*/
}
}

