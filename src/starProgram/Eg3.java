package starProgram;

public class Eg3 {

	public static void main(String[] args)
	{
//		   *
//		   * *
//		   * * *
//		   * * * *
//		   * * * * *
		
		int star=1;
		
		for(int i=star;i<=5;i++)
		{
			for (int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			star++;
		}
		
		
		
	}

}
