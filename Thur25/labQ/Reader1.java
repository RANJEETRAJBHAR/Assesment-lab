package File_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Reader1 {
public void read() throws IOException
{
	Reader r=new FileReader("C:\\Users\\USER-PC\\Desktop\\Data.txt");
	int i;
	while((i=r.read())!=-1);
	System.out.println((char)i);
	r.close();
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader1 obj=new Reader1();
		obj.read();
	}

}
