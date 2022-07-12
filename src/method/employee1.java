package method;

public class employee1 {
	
	//name,id,sal,dept.gender //these are the global variable because they are declared in class and not in any method
    String emp_Name;
	int emp_id;
	float emp_sal;
	String emp_dept;
	char gender;
	
	public static void main(String[] args) 
	{
		employee1 emp= new employee1();
		emp.emp_Name = "Ankita";
		emp.emp_id = 10;
		emp.emp_sal = 50000.50f;
		emp.emp_dept="R & D";
		emp.gender = 'F';
		
      emp.emp_info();  //calling global variable from same class
	}
	

	
	public void emp_info()
	{
	     System.out.println("employye name is "+emp_Name);
	     System.out.println("employye id is "+emp_id);
	     System.out.println("employye sal is "+emp_sal);
	     System.out.println("employye dept is "+emp_dept);
	     System.out.println("employye gender is "+gender);
		
	}
	
}