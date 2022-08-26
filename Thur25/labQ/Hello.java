package File_handling;

//Write a program to read content from one file and write it into another file 
import java.io.*;
//1st way
public class Hello
{
      public static void main(String[] args) throws IOException
           {
               FileReader fr=new FileReader("C:\\Users\\USER-PC\\Desktop\\abc.txt");
	           FileWriter fw=new FileWriter("C:\\Users\\USER-PC\\Desktop\\abc.txt");
	            int r1;
		while((r1=fr.read())!=-1)
		{
		   fw.write(r1);	
		}
		fw.close();
		fr.close();
              } 
}

