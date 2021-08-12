package com.BridgeLab.BasicCore;

import java.util.Scanner;

public class SwapNumber 
{
	public static void main(String[] args)
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int first=sc.nextInt();
		System.out.println("Enter second Number");
		int second=sc.nextInt();
		System.out.println("Before Swapping =>  First = "+first+ "  Second = "+second);
		temp=first;
		first=second;
		second=temp;
		System.out.println("After Swapping =>  First = "+first+ "  Second = "+second);

	}

}
