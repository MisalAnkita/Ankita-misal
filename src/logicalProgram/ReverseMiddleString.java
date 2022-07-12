package logicalProgram;

public class ReverseMiddleString {

	public static void main(String[] args) 
	{
	
		String a ="MY NAME IS ANKITA MISAL";
                // 1   2    3    4    5
		
		String[] ar = a.split(" ");
		
		for(int i=0;i<=ar.length-1;i++) // 0 1 2 traverse
		{
			if(i%2==0) // even
		 	{
				String s=ar[i];
				ar[i]=reveserString(s);
			}
			
			
		}
		for (int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
	}
	
	public static String reveserString(String inp)
	{
		String rev="";
		for(int i=inp.length()-1; i>=0;i--)
		{
			rev=rev+inp.charAt(i);
			
		}
		return rev;
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
