import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.psl.customizedSerialization.Jim;


public class Runner {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(new File ("fish.txt")));
        ois.writeObject(new Jim()); 
        
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("fish.txt")));
         Object o =   is.readObject();
         String  s = (String)o;
         System.out.println(s);
         o =   is.readObject();
          s = (String)o;
        System.out.println(s);
        
        
        
        
      /*  Object o = new String();
        System.out.println(o instanceof String );*/
        
     /*   File f = new File ("fish.txt");
        ois = new ObjectOutputStream(new FileOutputStream(f));
        ois.writeDouble(123.5676);
        FileOutputStream ff = new FileOutputStream(f);*/
 
        }

}
