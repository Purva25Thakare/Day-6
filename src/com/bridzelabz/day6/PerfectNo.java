package com.bridzelabz.day6;

import java.util.Scanner;

public class PerfectNo {
	public static void main(String[] args) {
		int i, num, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.println(" Please Enter any Number: ");
		num = sc.nextInt();

		for(i = 1 ; i < num ; i++) {
			if(num % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == num) {
			System.out.format("\n% d is a Perfect Number", +num);
		}
		else {
			System.out.format("\n% d is NOT a Perfect Number", +num);
		}
	}
}


