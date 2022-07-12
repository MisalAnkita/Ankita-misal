package constructor;

public class cc1 {
	int a = 100;// variable declaration and initilzation
	int b = 200;//variable declaration and initilzation


	public cc1(int x)//user defined with single parameter constructor
	
	{
		a=x;
	}

	public void cc1(int x,int y)//user defined with single parameter constructor
	{
		a=x;b=y;
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     cc1 c=new cc1(10); //created object without parameter constructor
     c.add();
     cc1 c1=new cc1(100);//created object with single parameter constructor
     c1.add();
     cc1 c2=new cc1(80);//created object with single parameter constructor
    c2.add();
		
		
	}
	public void add()
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
			
		
	}
	
}