package pokemon.model;

public class Geodude extends Pokemon implements Ground
{
	public Geodude()
	{
		super(74, "Geodude");
		setup();
	}
	
	public Geodude(String name)
	{
		super (74, name);
		setup();
	}
	
	public Geodude(int number, String name)
	{
		super (number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(80);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(40);
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
