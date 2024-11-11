package Question3;

import Question3.Employee;

public class Tester 
{
    
   public static void main(String[] args) {
	   Employee e1= new Employee( 1,"Chandu",80000);
	    Employee e2= new Employee( 2,"Alok",80000);
	    Employee e3= new Employee( 3,"Rushi",80000);
	    Employee e4= new Employee( 1,"Makrand",80000);
	    Employee[] emps= {e1,e2,e3,e4};
	    System.out.println(searchEmpByName(emps,"Alok"));
	    System.out.println(searchEmpById(emps,2));
}
   

private static String searchEmpByName(Employee[] emps,String name) 
{
	for(int i=0;i<emps.length;i++)
	{
		if(emps[i].getName().equals(name))
		{
			return "Employee Found at :"+i;
		}
	}
  
	return "No Employee Found";
}

private static String searchEmpById(Employee[] emps,int id) 
{
	for(int i=0;i<emps.length;i++)
	{
		if(emps[i].getEmpid()==id)
		{
			return "Employee Found at :"+i;
		}
	}
  
	return "No Employee Found";
}



}

