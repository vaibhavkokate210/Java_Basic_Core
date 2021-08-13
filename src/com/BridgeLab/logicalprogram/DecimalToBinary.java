package com.BridgeLab.logicalprogram;

import java.util.Scanner;

public class DecimalToBinary {

	public static void toBinary(int decimal)
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
	}
	public static void main(String[] args) {
		System.out.println("Enter decimal no : ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		toBinary(no);
	}

}
