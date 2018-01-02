package pokemon.model;

public class Magikarp extends Pokemon implements Water
{
	public Magikarp()
	{
		super(129, "Magikarp");
		setup();
	}
	
	public Magikarp(String name)
	{
		super (129, name);
		setup();
	}
	
	public Magikarp(int number, String name)
	{
		super (number, name);
		setup();
	}
	
	public void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(20);
	}
	
	public void waterBottleFlip()
	{
		
	}
	
	public void washYourHands()
	{
		
	}
	
	public void rainDropDropTop()
	{
		
	}
}
