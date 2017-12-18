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
	private SpringLayout baseLayout;
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel canEvolveLabel;
	private JLabel healthPointsLabel;
	private JLabel attackPointsLabel;
	private JLabel enhancementModifierLabel;
	private JTextArea number;
	private JTextArea name;
	private JCheckBox canEvolve;
	private JTextArea healthPoints;
	private JTextArea attackPoints;
	private JTextArea enhancementModifier;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		baseLayout = new SpringLayout();
		
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
