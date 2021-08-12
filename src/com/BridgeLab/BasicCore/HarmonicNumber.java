package com.BridgeLab.BasicCore;

import java.util.Scanner;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		int No;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		No= sc.nextInt();
		double HarmonicNumber=1;
		for (int i=2 ; i<=No ; i++)
		{
			HarmonicNumber= HarmonicNumber + (double)1/i;
		}
		System.out.println(HarmonicNumber);
	}

}
