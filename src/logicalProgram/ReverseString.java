package logicalProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter String for revesre string");
		
		String a = sc.next();
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		
		System.out.println("value of b is "+b);
		
		
		if(a.equals(b))
		{
			System.out.println("given string is palindrome");
		}
		
		else
		{
			System.out.println("given string is not palindrome");
	
		}

	}

}
