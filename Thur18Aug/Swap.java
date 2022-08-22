package com.String;


	import java.util.Scanner;

	public class Swap {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s1,s2;
	        System.out.println("Enter one string");
	        s1 = sc.next();
	        System.out.println("Enter second string");
	        s2 = sc.next();
	        System.out.println("String before swaping " + s1 +" "+ s2);
	        s1 = s1+s2;
	        s2= s1.substring(0,s1.length()-s2.length());
	        s1 = s1.substring(s2.length());
	        System.out.println("String after swaping " + s1 +" " + s2);
	    }
	}

