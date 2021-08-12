package com.BridgeLab.BasicCore;
import java.util.Scanner;


public class flipCoin 
{
	public static void main(String[] args)
	{
		int head=0;
		int tail=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of time to flip coin");
		int NoOfCoinFlip=sc.nextInt();
		for(int i=0;i<NoOfCoinFlip;i++)
		{
			double randomNo=Math.random();
		
			if(randomNo<0.5)
		       head++;
			else
				tail++;
		}
		System.out.println("Head = "+head);
		System.out.println("Tail = "+tail);
		double headper=((double)head/(double)NoOfCoinFlip)*100;
		double tailper=((double)tail/(double)NoOfCoinFlip)*100;
		System.out.println("Head = "+headper+" %");
		System.out.println("Tail = "+tailper+" %");
	}

}
