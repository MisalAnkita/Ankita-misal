package method;

public class MathOperation {

	public static void main(String[] args) 
	{
		 MathOperation mo=new  MathOperation();
		 mo.method1(4,5,6);

	}
	
	public void method1(int a,int b,int c)
	{

		System.out.println("addition is = "+(a+b));
		System.out.println("substraction is  = "+(a-b));
		System.out.println("multiplication is  = "+(a*b));
		System.out.println("division is  = "+(a/b));

	}
	
	

}