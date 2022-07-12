package method;

public class hrportal {


	public static void main(String[] args) 
	{
		employee1 emp= new employee1();
		emp.emp_Name = "Ankita";
		emp.emp_id = 10;
		emp.emp_sal = 50000.50f;
		emp.emp_dept="R & D";
		emp.gender = 'F';
		
        emp.emp_info();  // calling global variable from another class
      
        employee1 emp1= new employee1();
		emp1.emp_Name = "Shiv";
		emp1.emp_id = 2;
		emp1.emp_sal = 70000.50f;
		emp1.emp_dept="Design";
		emp1.gender = 'M';
		
        emp1.emp_info();  
      
      
      
      
      
      
      
	}
	
}