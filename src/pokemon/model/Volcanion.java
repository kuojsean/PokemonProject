package pokemon.model;

public class Volcanion extends Pokemon implements Water, Fire
{
	public Volcanion()
	{
		super(721, "Volcanion");
		setup();
	}
	
	public Volcanion(String name)
	{
		super (721, name);
		setup();
	}
	
	public Volcanion(int number, String name)
	{
		super (number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(110);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(80);
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
	
	public void mansNotHot()
	{
		
	}
	
	public void theFloorIsLava()
	{
		
	}
	
	public void lit()
	{
		
	}
}
