package p2;

class A
{
	A()
	{
		System.out.println("A");
	}
}

class B extends A
{
	//B(){} // sol - 1 
	B(int x)
	{
		System.out.println("B "+x);
	}
}

class C extends B
{
	C()
	{
		super(10); // navigate manually towards Super desired constructor
		// super have to be the first statement within constructor block
		System.out.println("C");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		new C();
	}
}
