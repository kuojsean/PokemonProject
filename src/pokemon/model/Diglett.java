package pokemon.model;

public class Diglett extends Pokemon implements Ground
{
	public Diglett()
	{
		super(50, "Diglett");
		setup();
	}
	
	public Diglett(String name)
	{
		super (50, name);
		setup();
	}
	
	public Diglett(int number, String name)
	{
		super (number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(55);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(10);
	}
	
	public void stepInMud()
	{
		
	}
	
	public void carpetBurn()
	{
		
	}
	
	public void pebbleToss()
	{
		
	}
}
