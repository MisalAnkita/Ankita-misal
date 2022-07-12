package logicalProgram;

import java.util.Scanner;

public class checkEvenOdd {

	public static void main(String[] args) 
	{
		
		//System.out.println(10/2);        //5
		//System.out.println(10%2);        //0
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number"); 
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
	
		}
		
		
		
		
		
	}

}
