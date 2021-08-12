package com.BridgeLab.BasicCore;

import java.util.Scanner;

public class QuotientRemainder 
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number:");	
		int number=sc.nextInt();
		System.out.println("Enter no tobe divided by :");
		int divide=sc.nextInt();
		int quotient=number/divide;
		int remainder=number%divide;
		System.out.println("Quotient = "+quotient);
		System.out.println("Remainder = "+remainder);
	}

}
