package pokemon.view;

import javax.swing.*;
import pokemon.controller.*;
import java.awt.event.*;
import java.awt.*;

/**
 * 
 * @author Sean Kuo
 *@version 12/12/17
 */
public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
