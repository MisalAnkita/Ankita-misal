package method;

public class nonstatic {

	public static void main(String[] args)
	{
      nonstatic obj = new nonstatic();
      obj.method1();
      nonstatic2 a = new nonstatic2();
      a.method2();
	}

	public void method1()
	{
		System.out.println("Hi this is nonstatic method from same class");
	}
}