package p5;


class Demo
{
	@Override
	public String toString() {
		
		return "Its a Demo Class Object";
	}
}

public class ObjectClassDemo {

	public static void main(String[] args) {

		Demo d = new Demo();
		String str = d.toString();
		System.out.println(d+" --- "+str);
	}
}
