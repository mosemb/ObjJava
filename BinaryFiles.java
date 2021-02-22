package objectoriented;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class BinaryFiles {
	
	public static void main(String []args) {
		// Working with binary files 
		File f3 = new File("f3.dat");
		FileOutputStream fOS;
		
		try {
			fOS = new FileOutputStream(f3);
			BufferedOutputStream bOS = new BufferedOutputStream(fOS); 
			DataOutputStream dOS = new DataOutputStream(bOS);
			
			// Putting primitivies in binary files. 
			String name = "Derrick"; 
			int age = 33;
			double bal = 1234.3;
			
			// Writing primitives. 
			dOS.writeUTF(name);
			dOS.writeInt(age);
			dOS.writeDouble(bal);
			dOS.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		// Reading from a binary file 
		f3 = new File("f3.dat");
		FileInputStream fIS;
		
		try {
			
			fIS = new FileInputStream(f3);
			BufferedInputStream bIS = new 	BufferedInputStream(fIS);
			DataInputStream dIS = new DataInputStream(bIS);
			
			System.out.println(dIS.readUTF());
			System.out.println(dIS.readInt());
			System.out.println(dIS.readDouble());
			fIS.close();
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		
		
	}

}
