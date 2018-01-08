package pokemon.view;

import pokemon.controller.*;
import javax.swing.JFrame;
/**
 * This is the frame for the pokemonproject app
 * @author Sean Kuo
 *@version 12/12/17
 */

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokemonPanel appPanel;
	
	public PokemonFrame (PokemonController appController)
	{
		super();
		this.appController = appController;
		appPanel = new PokemonPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(450,300);;
		this.setTitle("Pokedex");
		this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
