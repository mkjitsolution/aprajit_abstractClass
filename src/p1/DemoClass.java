package p1;

public class DemoClass {

	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		
		byte x = 10;
		obj.doStuff(x);
	}
	public void doStuff(Byte b)
	{
		System.out.println("byte");
	}
	
	public void doStuff(char x)
	{
		System.out.println("int");
	}
	public void doStuff(byte...b)
	{
		System.out.println("var args");
	}
}//
