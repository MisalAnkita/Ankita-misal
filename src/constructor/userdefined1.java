package constructor;

public class userdefined1 {

	public userdefined1() //user defined constructor without parameter or zero parameter
	{
	System.out.println("I am user defined constructor");
	int a=10;
	int b= 20;
	System.out.println( "value of a is a "+a);
	System.out.println( "value of a is b "+b);

	
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		userdefined1 c =new userdefined1();//object created for nonstatic method
		c.test();//object declaration
	}
	public void test()
	{
     System.out.println("this is test method");
    }

	
	
}