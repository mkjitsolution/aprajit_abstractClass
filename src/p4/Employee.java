package p4;

/**
 * @author ashis
 *
 */
public class Employee
{
	String name;
	int id;
	int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String n, int sal) {
		name = n;
		salary = sal;
	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void salaryHike(Employee e,int hikeAmt)
	{//               = e.getSalary();
		int oldSalary = this.getSalary();
		System.out.println(e);
		System.out.println(this);
		
		salary = oldSalary+hikeAmt;
	}
	
	public boolean compareSalary(Employee e2)
	{
		return this.getSalary() == e2.getSalary();
	}

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if(obj instanceof Employee)
		{
			Employee e = (Employee) obj;
			
			boolean a = this.getId() == e.getId();
			boolean b = this.getSalary() == e.getSalary();
			// name .. String 
			return a&&b;
			
		}
		
		return flag;
	}
	
	
	
	
	/*
	 * @Override public String toString() { return "Employee [name=" + name +
	 * ", id=" + id + ", salary=" + salary + "]"; }
	 */

	

	

}//end class
