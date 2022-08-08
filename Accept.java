/*Q1) Write a program to accept basic details name , Phone No , Address ,
user Id and password from the user . 
throw an exception if the user Id lenght is greater than 8 
and password is not matched and should only contain the string value.
Password rules:
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.
 */
package Assesment;

import java.util.Scanner;

public class Accept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int phone_no;
		String address;
		int User_Id;
		String password="ranjeet123";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();
		
		System.out.println("Enter your phone number:");
		phone_no=sc.nextInt();
		
		System.out.println("Enter your address:");
		address=sc.nextLine();
		
		try {
			sc.next();
			System.out.println("Enter User Id:");
			User_Id=sc.nextInt();
			int[] a=new int[8];
			if(a.length<=8)
			{
				System.out.println("User is less"+a[a.length]);		
			}
			else {
				throw new ArrayIndexOutOfBoundsException("The lenght is morethan Eight");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		if(password=="ranjeet123")
		{
			System.out.println("password are match");
		}
		else {
			System.out.println("password are not match");
		}
	}

}
