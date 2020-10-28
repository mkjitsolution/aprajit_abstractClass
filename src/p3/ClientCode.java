package p3;

public class ClientCode {

	
	public static void main(String[] args) {
		ClientCode user = new ClientCode();
		
		Animal a = new Dog(); // down-casting
		
		user.doActivity(a);
		a = new Cow();
		user.doActivity(a);
	}
	
	public void doActivity(Animal a)
	{
		// 1000 lines code
		a.doEat(); // change the state
		System.out.println(a.getPoint());
		// d.playGames(); // maintain the state of app
		// typecast
		// byte b = (byte)10;
		if(a instanceof Dog)
		{
			Dog d = (Dog)a; // up-casting
			d.playGames();
			System.out.println(d.getPoint());
			
		}
		if(a instanceof Cow)
		{
			Cow d = (Cow)a;
			d.cowWork();
			System.out.println(d.getPoint());
		}
		
	}
}
