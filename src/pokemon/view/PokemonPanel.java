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
	private JLabel iconLabel;
	
	private JTextField numberField;
	private JTextField nameField;
	private JCheckBox canEvolveCheckBox;
	private JTextField healthPointsField;
	private JTextField attackPointsField;
	private JTextField modifierField;
	private JTextField pokemonPicture;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton load;
	private JButton reset;
	private JButton save;
	private JComboBox pokemonList;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		canEvolveCheckBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex.get(index).getNumber() + "");
		attackPointsField.setText(appController.getPokedex.get(index).getAttackPoints() + "");
		healthPointsField.setText(appController.getPokedex.get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex.get(index).getEnhancementModifier() + "");
	}
	
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
		iconLabel = new JLabel();
		
		numberField = new JTextField();
		nameField = new JTextField();
		canEvolveCheckBox = new JCheckBox();
		healthPointsField = new JTextField();
		attackPointsField = new JTextField();
		modifierField = new JTextField();
		pokemonPicture = new JTextField();
		
		descriptionArea = new JTextArea();
		typeArea = new JTextArea();
		
		load = new JButton();
		reset = new JButton();
		save = new JButton();
		pokemonList = new JComboBox();
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
				
		
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
		this.add(iconLabel);
		
		this.add(numberField);
		this.add(nameField);
		this.add(canEvolveCheckBox);
		this.add(healthPointsField);
		this.add(attackPointsField);
		this.add(modifierField);
		this.add(pokemonPicture);
		
		this.add(descriptionArea);
		this.add(typeArea);
		
		this.add(load);
		this.add(reset);
		this.add(save);
		this.add(pokemonList);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
