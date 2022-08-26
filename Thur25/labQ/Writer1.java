package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer1 extends Reader1 {
 public void Writer() throws IOException 
 {
	 File f=new File("C:\\Users\\USER-PC\\Desktop\\Data.txt");
	 if(f.createNewFile())
	 {
		System.out.println("File are succesfully created"+f.getAbsolutePath()); 
	 }
	 else
	 {
		 System.out.println("File are not created");
	 }
	 FileWriter w=new FileWriter("C:\\Users\\USER-PC\\Desktop\\Data.txt");
	 String s="Hello Ranjeet Rajbhar";
	 w.write(s);
	 w.close();
 }
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer1 obj=new Writer1();
		obj.Writer();
		obj.read();
	}

}
