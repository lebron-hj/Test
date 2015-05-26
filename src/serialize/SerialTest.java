package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialTest extends parent implements Serializable {   
    /**
	 * 
	 */
	private static final long serialVersionUID = 4656820882674692928L;
	/**
	 * 
	 */
	int version = 660;   
    contain con = new contain();   
    public int getVersion() {  
           return version;   
    }  
    public static void main(String args[]) throws IOException, ClassNotFoundException {  
           FileOutputStream fos = new FileOutputStream("temp.out");  
           ObjectOutputStream oos = new ObjectOutputStream(fos);  
           SerialTest st = new SerialTest();  
           oos.writeObject(st);  
           oos.flush();  
           oos.close(); 
           
           FileInputStream fis = new FileInputStream("temp.out");
           ObjectInputStream ois = new ObjectInputStream(fis);
           SerialTest st1 = (SerialTest)ois.readObject();
           System.out.println(st1.parentVersion);
    }  
}  
class parent{          
    int parentVersion = 10;   
} 
class contain implements Serializable{          
    int containVersion = 11;   
} 