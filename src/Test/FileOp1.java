package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOp1 {
	public static void main(String[] args) {
		FileOutputStream fileOutputStream;
		try {
            fileOutputStream = new FileOutputStream("abc.txt");
            String msg = "Welcome to java!";   
            
            byte byteArray[] = msg.getBytes(); //converting string into byte array 
            
            fileOutputStream.write(byteArray);  
            
            System.out.println("Message written to file successfuly!");  
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
			
		}
			
		}


