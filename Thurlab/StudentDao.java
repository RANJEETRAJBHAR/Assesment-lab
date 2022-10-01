package Assesment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao 
{
    public static boolean insertStudentToDB(Student st)
    {
    	
    	boolean f=false;
    	try
    	{
    		//jdbc code....
    		Connection con=Cp.create();
    		String q="insert into students(sname,sphone,scity) values(?,?,?)";
    		
    		//preparedStatement
    		PreparedStatement pst=con.prepareStatement(q);
    		
    		//set the value of parameter
    		pst.setString(1, st.getStudentName());
    		pst.setString(2, st.getStudentPhone());
    		pst.setString(3, st.getStudentCity());
    		
    		//execute
    		pst.executeUpdate();
    		f=true;
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return f;
    
    }

	
    public static boolean deleteStudent(int userId)
    {
    	boolean f=false;
    	try
    	{
    		//jdbc code....
    		Connection con=Cp.create();
    		String q="delete from students where sid=?";
    		
    		//preparedStatement
    		PreparedStatement pst=con.prepareStatement(q);
    		
    		//set the value of parameter
    		pst.setInt(1, userId);

    		//execute
    		pst.executeUpdate();
    		f=true;
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
		return f;
    
    
	}


	public static void showAllStudent()
	{
	
    	try
    	{
    		//jdbc code....
    		Connection con=Cp.create();
    		String q="select * from students;";
    		
    		Statement stmt=con.createStatement();
    		ResultSet set=stmt.executeQuery(q);
    		
    		while(set.next())
    		{
    			int id=set.getInt(1);
    			String name=set.getString(2);
    			String phone=set.getString(3);
    			String city=set.getString("scity");
    			
    			System.out.println("ID:"+id);
    			System.out.println("Name:"+name);
    			System.out.println("Phone:"+phone);
    			System.out.println("City:"+city);
    			System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    			
    			
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
	
    
		
	}
}
