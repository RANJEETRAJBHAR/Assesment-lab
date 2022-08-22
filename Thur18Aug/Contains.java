package com.String;


	import java.util.Locale;
	import java.util.Scanner;

	public class Contains {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s1,s2,s4,s5;
	        boolean s3=false;
	        System.out.println("Enter first string");
	        s1 = sc.next();
	        s4 = s1.toLowerCase();
	        System.out.println("Enter second string");
	        s2 = sc.next();
	        s5= s2.toLowerCase();
	        if(s4.contains(s5)){
	            s3 = true;
	            System.out.println(s3);
	        }
	        else{
	            System.out.println("It dosent containe");
	        }

	    }
	}

