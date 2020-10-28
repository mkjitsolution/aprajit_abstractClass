package p4;



public class BasicDemo {
	public static void main(String[] args) {
	
		new BasicDemo().thisDemo();
		
	}
	
	public void thisDemo()
	{
		// this points to Current calling Object
		
		Employee e1 = new Employee("mike", 2000);
		Employee e2 = new Employee("jenny", 2500);
		Employee e3 = new Employee("Ashish", 2000);
		//e1.salaryHike(e1,800);
		
		boolean status = e1.compareSalary(e3);
		System.out.println(status);
		
		boolean abc = e1.equals(e2);
	
		
	}
	
}



