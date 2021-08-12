package com.BridgeLab.BasicCore;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("Enter the number :");
          Scanner sc=new Scanner(System.in);
          int no=sc.nextInt();
          for(int i=2;i<no;i++)
          {
        	  while(no%i==0)
        	  {
        		  System.out.println(i+ " ");
        		  no=no/i;
        	  }
          }
          if(no>2)
            System.out.println(no);
	}

}
