package p3;

interface Jump{
	public void doJump(Force force);
}

class Car implements Jump
{

	@Override
	public void doJump(Force force) {
		// TODO Auto-generated method stub
		
	}
	
}
public abstract class Animal {

	int point = 100;
	
	public abstract void doEat();
	
	public abstract void run(Leg legs[],Energy energy);
	
	public int getPoint()
	{
		return point;
	}
}

class Dog extends Animal implements Jump
{
	
	@Override
	public void doJump(Force force) {
		// TODO Auto-generated method stub
		// code to Jump
		
	}

	@Override
	public void run(Leg[] legs, Energy energy) {
		// TODO Auto-generated method stub
		// 1000 lines of code to run
	}
	
	public void doEat()
	{ // 1000 lines of code
		point++; // 101
		System.out.println("dog eats biscuits ...");
	}
	public void playGames()
	{
		point+=100;
		System.out.println("Dog playes Game");
		
	}
}

class Cow extends Animal
{
	@Override
	public void run(Leg[] legs, Energy energy) {
		// TODO Auto-generated method stub
		// 1000 lines of code to run
	}
	
	public void doEat()
	{ // 1000 lines of code
		point++;
		System.out.println("Cow eats Grass ...");
	}
	public void cowWork()
	{
		point+= 200;
		System.out.println("cow Works called...");
		
	}
}

class Ball implements Jump
{

	@Override
	public void doJump(Force force) {
		// TODO Auto-generated method stub
		
	}

	
}
