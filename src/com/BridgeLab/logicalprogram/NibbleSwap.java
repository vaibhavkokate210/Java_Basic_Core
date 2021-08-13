package com.BridgeLab.logicalprogram;

import java.util.Scanner;

public class NibbleSwap {

	public static int[] toBinary(int decimal)
	{
		int add=0;
		int binary[]=new int[8];
		int octalNo[]=new int[8];
		int index=0;
		
		while(decimal>0)
		{
			binary[index++]=decimal%2;
			decimal=decimal/2;
		}
		add=binary.length-index;
		for(int j=0;j<add;j++)
			octalNo[j]=0;
		
		for(int i=index-1,k=add;i>=0&&k<8;i--,k++)
		{
			octalNo[k]=binary[i];
		}
			
		System.out.print("8 bit binary representation = ");
          for(int l=0;l<octalNo.length;l++)
        	  System.out.print(octalNo[l]);
		return octalNo;
	}
	public static void main(String[] args) {
		System.out.println("Enter decimal no : ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int arr[]=toBinary(no);
		int decimal=0;
		int n = 0;
		System.out.println();
		for(int i=0,j=arr.length/2;i<arr.length/2&&j<arr.length;i++,j++)
		{
			int temp;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		System.out.print("After swapping Nibbles = ");
		 for(int k=0;k<arr.length;k++)
       	      System.out.print(arr[k]);
		 
		for(int l=arr.length-1;l>=0;l--)
		{	
			if(arr[l]==1)
			{
				decimal=(int) (decimal+Math.pow(2,n));
				n++;
			}
			else
				n++;
		}
		System.out.println();
		System.out.println("Decimal number after swapped nibble = "+decimal);
	}

}
