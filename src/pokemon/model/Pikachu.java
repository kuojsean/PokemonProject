package pokemon.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super(25, "Pikachu");
		setup();
	}
	
	public Pikachu(String name)
	{
		super (25, name);
		setup();
	}
	
	public Pikachu(int number, String name)
	{
		super (number, name);
		setup();
	}
	
	public void setup()
	{
		this.setAttackPoints(55);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(25);
	}
	
	public void forkInToaster()
	{
		
	}
	
	public void christmasTreeLights()
	{
		
	}
	
	public void urAWizardHarry()
	{
		
	}
}
