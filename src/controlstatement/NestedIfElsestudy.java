package controlstatement;

public class NestedIfElsestudy {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 //       if username is correct ---enter password
		{
//		  if ----  password correct ---enter login
//		  else---enter correct password
		}
		
//		else---enter correct username
		
		 
		
		String UN="Velocity";
		
		String PWD="Velocity@123";
if(UN=="Velocity")
		{
			System.out.println("Enter password");
			
			if(PWD=="Pune@123")
			{
				System.out.println("log in success");
				
			}
			else
			{
				System.out.println("password is incorrect");
			}
			
		}	
		
else 
		{
			System.out.println("password enter correct username");

		}
		
	}
	
	
	

}