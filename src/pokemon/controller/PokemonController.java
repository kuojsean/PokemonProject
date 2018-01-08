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

	private ArrayList<Pokemon> pokedex;
	
	private void setupPokedex()
	{
		Pikachu pikachu = new Pikachu();
		Raichu raichu = new Raichu();
		Diglett diglett = new Diglett();
		Geodude geodude = new Geodude();
		Magikarp magikarp = new Magikarp();
		Volcanion volcanion = new Volcanion();
		pokedex.add(pikachu);
		pokedex.add(raichu);
		pokedex.add(diglett);
		pokedex.add(geodude);
		pokedex.add(magikarp);
		pokedex.add(volcanion);
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
	
	
	public void start()
	{
		setupPokedex();
	}
}
