package com.BridgeLab.BasicCore;

public class LargestNumber 
{
	public static void main(String[] args)
	{
		int a=9,b=7,c=8;
		if(a>b)
		{
			if(a>c)
			    System.out.println("a is greatest");
			else
				System.out.println("c is gretest");
		}
		else if(b>a)
		{
			if(b>c)
              System.out.println("b is gretest");
			else
				System.out.println("c is greates");
		}
		else
			System.out.println("c is grestes");
	}

}
