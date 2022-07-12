package VariableStudy;

public class variable 
{ static int a=10;                // global variable
         int b=20;

	public static void main(String[] args) 
	{
		add();                                         //this is for calling  static method from same class
		variable gv= new variable();      // this is for calling non static method from same class
		gv.sub();
		System.out.println("value of a is "+a);       // calling static global variable from same class 
		System.out.println("value of a is "+gv.b);   //calling non static global variable from same class
		
		
		
		
		//int sub=200-gv.a; // using static variable from same class
		//int sub1=300-a;
		
		variablestudy3 v= new variablestudy3();
		System.out.println("value of a is "+variablestudy3.b);         //calling  static global variable from another class
		System.out.println("value of a is "+v.a);                      // calling non static global variable from another class 
		
		
		
		int sub = 500-a;             //using static global variable from same class
		int sub1=300-gv.b;           //using non static global variable from same class
		
		
		int sub3=500-v.a;                 //using non static global variable from another class
		int sub4=500-variablestudy3.b;      //using static global variable from another class
		            //methodname//
		
		
		
	}  
	
	public static void add()
	{
		System.out.println("value of a is +a");
	}
	public void sub()
	{
		System.out.println("value of b is "+b);
	}

}