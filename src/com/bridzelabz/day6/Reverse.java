package com.bridzelabz.day6;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args)   
	{  
		Scanner nr = new Scanner(System.in);
		System.out.println(" Please Enter any Number: ");
		int num =nr.nextInt();
		int reverse = 0;  
		while(num != 0)   
			{  
				int remainder = num % 10;  
				reverse = reverse * 10 + remainder;  
				num = num/10;  
			}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  

