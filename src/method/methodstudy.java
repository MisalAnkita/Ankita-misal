package method;



public class methodstudy {

	public static void main(String[] args) 
	{
     addition();
     methodstudy sub = new methodstudy();
     sub.substraction();
     add1(10,20);
	}
     
	public static void addition()
	{   
		int a=10;
	    int b=20;
	    System.out.println("The is addition "+(a+b));
		
	}
	public void substraction()
	{
		int a=10;int b=30;
		System.out.println("this is substarction "+(a-b));
	}
	
	public static void add1(int a,int b)
	{
	    System.out.println("this is addition = "+(a+b));	
	}
	
	
}