package thisAndsuper;

public class ThisUse {
	 int a=10;           // non static global variable
	 int b=20;           
	 static int c=30;   // static global variable
	 

	public static void main(String[] args)
	{
		ThisUse t = new ThisUse();
		t.add();
	}

	public void add() 
	{    int a=50;
		System.out.println(a);                            //calling local variable
		System.out.println(this.a);                       // calling global variable in local class
		System.out.println("addition is "+(b+a));         // using local variable
		System.out.println("addition is "+(b+this.a));    // using global variable in local class
	}
	
	
	
	
	
	
	
	
}