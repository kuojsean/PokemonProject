package pokemon.controller;

import pokemon.model.*;
import pokemon.view.*;
import java.util.*;

/**
 * This is the controller for the PokemonProject
 * @author Sean Kuo
 * @version 12/12/17
 */
public class PokemonController
{

	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		setupPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	private void setupPokedex()
	{
		pokedex.add(new Pikachu());
		pokedex.add(new Raichu());
		pokedex.add(new Diglett());
		pokedex.add(new Geodude());
		pokedex.add(new Magikarp());
		pokedex.add(new Volcanion());
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only integer values are valid.");
		}
		
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Only double values are valid.");
		}
		
		return valid;
	}
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index ++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}
	
	public void start()
	{
		setupPokedex();
	}
}
