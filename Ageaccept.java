/*Q2)Program to input age from user and throw user-defined exception if entered age is negative
In this program, we have created an exception class AgeException which extends the built-in Exception class. In main method, we read the input from user using Scanner after that we check the age in try block. If it is less than 18 then it will throw an exception other it will display message "Valid age".
 * 
 * 
 */
package Assesment;

import java.util.Scanner;

public class Ageaccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		
		
		try {
			if(age<18)
			{
				throw new User("Invalid age");
			}
			else {
				throw new User ("valid age");
			}
		}catch(User e) {
			System.out.println(e);
		}
		}

}

