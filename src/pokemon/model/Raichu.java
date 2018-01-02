package pokemon.model;

public class Raichu extends Pikachu
{
	public Raichu()
	{
		super(26, "Raichu");
		setup();
	}
	
	public Raichu(String name)
	{
		super (26, name);
		setup();
	}
	
	public Raichu(int number, String name)
	{
		super (number, name);
		setup();
	}
}
