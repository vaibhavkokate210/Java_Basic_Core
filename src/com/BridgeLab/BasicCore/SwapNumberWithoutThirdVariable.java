package com.BridgeLab.BasicCore;

import java.util.Scanner;

public class SwapNumberWithoutThirdVariable 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int first=sc.nextInt();
		System.out.println("Enter second Number");
		int second=sc.nextInt();
		System.out.println("Before Swapping =>  First = "+first+ "  Second = "+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After Swapping =>  First = "+first+ "  Second = "+second);

	}

}
