package thisAndsuper;

public class SuperUse extends ThisUse {
	
	
	int a=100;

	public static void main(String[] args) 
	{
		SuperUse su = new SuperUse();
		su.sub();
	}
	public void sub()
	{
		int a=700;
	   System.out.println(this.a-a);       // using golbal variable from same class
	   System.out.println(super.a-a);       //using global varible from super class
		
		
	}
	
	
	

}