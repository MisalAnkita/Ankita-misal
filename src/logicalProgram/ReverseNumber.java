package logicalProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
	

		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");

		int num=sc.nextInt();
	
		String strNum = Integer.toString(num);
		String rev="";
		
		for(int i=strNum.length()-1;i>=0;i--)	
		{
			rev=rev+strNum.charAt(i);
			
		}
		
		int revNum = Integer.parseInt(rev);
		
		System.out.println("original number is "+num);
		System.out.println("reverse num is "+revNum);
		
		
	}

}
