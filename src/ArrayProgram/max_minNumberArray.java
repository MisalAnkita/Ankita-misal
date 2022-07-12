package ArrayProgram;

public class max_minNumberArray {

	public static void main(String[] args) 
	{
		
		 int a[]=new int [] {1,24,3,4};
	     int max=a[0];
	     
	     for(int i=1;i<=a.length-1;i++)
	     {
	    	 if(a[i]>max)
	    	 {
	    		 max=a[i];
	    		 
	    	 }
	     }

	     System.out.println( "max number is"+ max);
	     
		
	
	
	
	//min
	
	     int b[]=new int [] {3,6,7,4};
	     int min=b[0];
	     
	     for(int i=1;i>=b.length-1;i--)
	     {
	    	 if(b[i]<min)
	    	 {
	    		 min=b[i];
	    	 }
	     }

	     System.out.println("min number is"+min);
	     
	
	
	
	
	
	
		}

}
	
	
	
	
	

