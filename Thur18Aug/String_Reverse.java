package com.String;


	import java.util.Scanner;

	public class String_Reverse {			
		
		Scanner sc = new Scanner(System.in);				
		String str,st="";
		char ch;
		void accept()							
		{
			System.out.print("Enter a String : ");
			 str = sc.nextLine();
		}
		void reverse()							
		{
			accept();						
			for(int i=0; i<str.length(); i++)			
			{
				ch = str.charAt(i);				
				st = ch+st;					
			}
			System.out.print(st);	
		}

		public static void main(String[] args) {			
			
			String_Reverse ob= new String_Reverse();		
			ob.reverse();						
			}

	}

