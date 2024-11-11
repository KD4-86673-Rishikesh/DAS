package Question2;

import java.util.Arrays;

import Question2.Employee;

public class Tester 
{
    
   public static void main(String[] args) {
	   Employee e1= new Employee( 1,"Chandu",80000);
	    Employee e2= new Employee( 2,"Alok",70000);
	    Employee e3= new Employee( 3,"Rushi",60000);
	    Employee e4= new Employee( 1,"Makrand",50000);
	    Employee[] emps= {e1,e2,e3,e4};
	    sortEmpBySalary(emps);
	    System.out.println(Arrays.toString(emps));
	    
}
   

private static void sortEmpBySalary(Employee[] emps) 
{
	int n=emps.length;
	for(int i=1;i<n;i++)
	{
		for(int j=0;j<n-i;j++)
		if(emps[j+1].getSalary()<emps[j].getSalary())
		{
			Employee temp=emps[j];
			emps[j]=emps[j+1];
			emps[j+1]=temp;
		}
	}
  
	
}





}

