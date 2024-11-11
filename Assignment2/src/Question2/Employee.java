package Question2;

public class Employee {
   int empid;
   String name;
   int salary;
   
   @Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}

public Employee(int empid, String name, int salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public Employee() {
	}

public Employee(int empid, String name) {
	this.empid = empid;
	this.name = name;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   
}
