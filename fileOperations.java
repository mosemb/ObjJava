package objectoriented;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class fileOperations {
	
	public static void main(String []args) {
		
		File fil = new File("File.log"); 
		
		try {
			if(fil.createNewFile()) {
				System.out.println("File new was created ");
				fil.renameTo(new File("fica.log"));
				//fil.delete(); // IF you want to delete the file then its done this way
				
			}else {
				
				System.out.println("File not created");
				
			}
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
	
		
		// Create a directory
		
		File dirk = new File("/"); 
		
		if(dirk.isDirectory()) {
			
			File [] files = dirk.listFiles();
			for(File x: files) System.out.println(x.getName());
			
		}
		
		// Writting to a file 
		File f2 = new File("f2.txt");
		
		try {
			PrintWriter pw = new PrintWriter(
							new BufferedWriter(
									new FileWriter(f2)),true);
			pw.println("This is sample text ");
			pw.close();
					
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// Reading a file 
		f2 = new File("f2.txt");
		try {
			BufferedReader bf = new BufferedReader(new FileReader(f2));
			String text = bf.readLine();
			while(text!=null) {
				System.out.println(text);
				text = bf.readLine();
				
			}
			bf.close();
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
	

}
