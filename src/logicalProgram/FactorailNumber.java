package logicalProgram;

public class FactorailNumber {

	public static void main(String[] args)
	{
		
		
		
		//4!=4*3*2*1
		int a=10;
		int fact =1;
		
		for(int i=a;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		

	}

}
