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
	private JTextArea pokemonPicture;
	private JTextArea firstTextBox;
	private JTextArea secondTextBox;
	private JButton load;
	private JButton reset;
	private JButton save;
	private JComboBox pokemonList;
	
	public PokemonPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		baseLayout = new SpringLayout();
		numberLabel = new JLabel("#");
		nameLabel = new JLabel ("Name");
		canEvolveLabel = new JLabel ("Can Evolve");
		healthPointsLabel = new JLabel ("Health");
		attackPointsLabel = new JLabel ("Attack");
		enhancementModifierLabel = new JLabel ("Enhancement");
		number = new JTextArea();
		name = new JTextArea();
		canEvolve = new JCheckBox();
		healthPoints = new JTextArea();
		attackPoints = new JTextArea();
		enhancementModifier = new JTextArea();
		pokemonPicture = new JTextArea();
		firstTextBox = new JTextArea();
		secondTextBox = new JTextArea();
		load = new JButton();
		reset = new JButton();
		save = new JButton();
		pokemonList = new JComboBox();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.RED);
		this.setLayout(baseLayout);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(canEvolveLabel);
		this.add(healthPointsLabel);
		this.add(attackPointsLabel);
		this.add(enhancementModifierLabel);
		this.add(number);
		this.add(name);
		this.add(canEvolve);
		this.add(healthPoints);
		this.add(attackPoints);
		this.add(enhancementModifier);
		this.add(pokemonPicture);
		this.add(firstTextBox);
		this.add(secondTextBox);
		this.add(load);
		this.add(reset);
		this.add(save);
		this.add(pokemonList);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
