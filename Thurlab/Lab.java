package Assesment;

import java.util.Scanner;

/*Q1) Write a program to accept basic details name , Phone No , Address ,
user Id and password from the user . 
throw an exception if the user Id lenght is greater than 8 
and password is not matched and should only contain the string value.
Password rules:
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.
 */
public class Lab {
	public static String name;
	public static long phone_No;
	public static String Address;
	public static int user_Id;
	private static  String password;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name:");
		name=sc.nextLine();
		System.out.println("Enter a Phone no:");
		phone_No=sc.nextLong();
		System.out.println("Enter a Address:");
		Address=sc.nextLine();
		sc.next();
		
		System.out.println("Enter a user Id:");
		user_Id=sc.nextInt();
		System.out.println("Enter a Password:");
		try {
			try {
				password=sc.next();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
        
}
