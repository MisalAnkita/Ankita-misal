package constructor;

public class constructorstudy 
{
public constructorstudy()            // user defined constructor
{                                     //when we  create object automatically constructor is getting automatically called 
	System.out.print("Hi Ankita");    //means whatever written in your constructor it will get print
	
}

public static void main(String[] args) 
{
	constructorstudy a=new constructorstudy();
	//a.add();
}

public void add()
{
 int a=10;
 int b=20;
 System.out.println("the addition is "+(a+b));
}
}