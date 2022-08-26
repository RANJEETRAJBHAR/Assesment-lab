package File_handling;
//2nd way
import java.io.*;
class Hii
{
     public static void main(String[] args) throws IOException
             {
                             FileInputStream fin=new FileInputStream("C:\\Users\\USER-PC\\Desktop\\ranjeet.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\USER-PC\\Desktop\\ranjeet.txt");
		int r1;
		while((r1=fin.read())!=-1)
		{
		   fout.write(r1);	
		}
		fout.close();
		fin.close();
	}
}
