package com.BridgeLab.logicalprogram;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int thousand=0,fiveHundred = 0,hundred=0,fifty=0,ten=0,five=0,two=0,one=0;
		int count=0;
		int note[]= {1000,500,100,50,10,5,2,1};
		String str[]=new String[8];
		System.out.println("Enter change you want :");
		Scanner sc=new Scanner(System.in);
		int change=sc.nextInt();
		for(int i=0;change>0;i++)
		{
			int no=change/note[i];
			if(no>0 && note[i]==1000)
			{
				thousand=no;
				change=change-(no*1000);
				str[i]=no + " Thousand Notes";
			}
			else if(no>0 && note[i]==500)
			{
				fiveHundred=no;
				change=change-(no*500);
				str[i]=no + " Five_Hundred Notes";
			}
			else if(no>0 && note[i]==100)
			{
				hundred=no;
				change=change-(no*100);
				str[i]=no + " Hundred Notes";
			}
			else if(no>0 && note[i]==50)
			{
				fifty=no;
				change=change-(no*50);
				str[i]=no + " Fifty Notes";
			}
			else if(no>0 && note[i]==10)
			{
				ten=no;
				change=change-(no*10);
				str[i]=no + " Ten Notes";
			}
			else if(no>0 && note[i]==5)
			{
				five=no;
				change=change-(no*5);
				str[i]=no + " Five Notes";
			}
			else if(no>0 && note[i]==2)
			{
				two=no;
				change=change-(no*2);
				str[i]=no + " Two Notes";
			}
			else if(no>0 && note[i]==1)
			{
				one=no;
				change=change-(no*1);
				str[i]=no + " One Notes";
			}		
		}
		count=thousand+fiveHundred+hundred+fifty+ten+five+two+one;
		System.out.println("Minimum number of notes = "+count);
		System.out.println("List of Notes Given : ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!=null)
			System.out.println(str[i]);
		}
	}

}
