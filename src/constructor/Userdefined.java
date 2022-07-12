package constructor;

public class Userdefined {
	int a = 100;// variable declaration and initilzation
	int b = 200;//variable declaration and initilzation


	public Userdefined() 
	{
		// we cannot intialize or declare the 
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Userdefined c= new Userdefined();
		c.addition();
		c.substraction();

	}
	public void addition()
	{
		int sum = a+b;
		System.out.println("sum is "+sum);		
	}
	public void substraction()
	{
		
		int sub = a-b;
		System.out.println("sub is "+sub);		
	}

}