package controlstatement;

public class switchcasestudy {

	public static void main(String[] args)
	{
    //when we have multiple condition instead of using else if we can use switchcase 
	//because by using this we can go directly on that condition
		
		int Year=6;
		switch(Year) {
		case 1:System.out.println("You are 1 st year of engineering");
		break;
		case 2:System.out.println("You are 2 nd year of engineering");
		break;
		case 3:System.out.println("You are 3 rd year of engineering");
		break;
		case 4:System.out.println("You are 4 th year of engineering");
		break;
		default:System.out.println("please enter between 1-4");
		break;

			
	}
		int day =2;
		switch(day) { 
		case 1:System.out.println("welcome in monday");
		break;
		case 2:System.out.println("wekcome in tuesday");
		break;
	
		
		}
		
		// similarly we can do this for jan-dec and sun-mon
		
	}

}