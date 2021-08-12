package com.BridgeLab.BasicCore;

import java.util.Scanner;

public class PowerOfTwo 
{
	public static void main(String[] args)
	{
		int Number;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		Number= sc.nextInt();
		
		int PowerOfNumber=1;
		System.out.println(PowerOfNumber);
		for (int i=1;i<Number;i++)
		{
			PowerOfNumber= PowerOfNumber*2;
			System.out.println(PowerOfNumber);
		}
	}

}
