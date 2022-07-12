package ArrayProgram;

public class copyArray {

	public static void main(String[] args) 
	{
		// intilaizing one arrays
         int a[]=new int[] {1,2,3};
         
		//creting another array with same size of first array
		int b[]= new int[a.length];
		
		//copying all elements of arr1 to arr2
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
		}
		
		
		System.out.println("copying array");
		b=a;
		for(int j=0;j<=b.length-1;j++)
		{
			System.out.print(b[j]);
		}
		
		
		
		
		
		
		
		
	
		
		
    }
	}