package com.BridgeLab.BasicCore;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		System.out.println("Enter no tobe check for Even or Odd :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number%2==0)
			System.out.println(number+" is Even number");
		else
			System.out.println(number+" is Odd number");
	}

}
