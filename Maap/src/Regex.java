import java.util.regex.Pattern;


public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("[a]+");
		String a[] = p.split("qwertybaaab");
		System.out.println(a.length);
		for (String string : a) {
			System.out.println(string);
		}

	}

}
