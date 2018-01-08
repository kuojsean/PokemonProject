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
	private JLabel pokemonPicture;
	
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
		pokemonPicture = new JLabel("pokemon", new ImageIcon(getClass().getResource("/pokemon/view/images/logo.png")), JLabel.CENTER);
		
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
		baseLayout.putConstraint(SpringLayout.NORTH, numberLabel, 150, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, numberLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, nameLabel, 15, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, canEvolveLabel, 15, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, canEvolveLabel, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthPointsLabel, 15, SpringLayout.NORTH, canEvolveLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthPointsLabel, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, attackPointsLabel, 15, SpringLayout.NORTH, healthPointsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, attackPointsLabel, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, enhancementModifierLabel, 15, SpringLayout.NORTH, attackPointsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, enhancementModifierLabel, 0, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 100, SpringLayout.WEST, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberField, 0, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, 0, SpringLayout.SOUTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, canEvolveCheckBox, 0, SpringLayout.NORTH, canEvolveLabel);
		baseLayout.putConstraint(SpringLayout.WEST, canEvolveCheckBox, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.SOUTH, canEvolveCheckBox, 0, SpringLayout.SOUTH, canEvolveLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, healthPointsField, 0, SpringLayout.NORTH, healthPointsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthPointsField, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthPointsField, 0, SpringLayout.SOUTH, healthPointsLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthPointsField, 0, SpringLayout.EAST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, attackPointsField, 0, SpringLayout.NORTH, attackPointsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, attackPointsField, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.SOUTH, attackPointsField, 0, SpringLayout.SOUTH, attackPointsLabel);
		baseLayout.putConstraint(SpringLayout.EAST, attackPointsField, 0, SpringLayout.EAST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, enhancementModifierLabel);
		baseLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, numberField);
		baseLayout.putConstraint(SpringLayout.SOUTH, modifierField, 0, SpringLayout.SOUTH, enhancementModifierLabel);
		baseLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, numberField);
		baseLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.WEST, iconLabel, 200, SpringLayout.WEST, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonPicture, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonPicture, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonPicture, -20, SpringLayout.SOUTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonPicture, -250, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 0, SpringLayout.NORTH, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.WEST, descriptionArea, 40, SpringLayout.EAST, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, 65, SpringLayout.NORTH, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.EAST, descriptionArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, typeArea, 6, SpringLayout.SOUTH, descriptionArea);
		baseLayout.putConstraint(SpringLayout.WEST, typeArea, 40, SpringLayout.EAST, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.SOUTH, typeArea, -154, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, typeArea, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, load, 0, SpringLayout.WEST, iconLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, load, 0, SpringLayout.SOUTH, nameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, reset, 0, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, reset, 6, SpringLayout.EAST, load);
		baseLayout.putConstraint(SpringLayout.NORTH, save, 0, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, save, 6, SpringLayout.EAST, reset);
		baseLayout.putConstraint(SpringLayout.NORTH, pokemonList, -4, SpringLayout.NORTH, healthPointsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonList, 10, SpringLayout.WEST, load);
		baseLayout.putConstraint(SpringLayout.EAST, pokemonList, 0, SpringLayout.EAST, descriptionArea);
		baseLayout.putConstraint(SpringLayout.NORTH, firstType, 6, SpringLayout.NORTH, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.EAST, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstType, 30, SpringLayout.NORTH, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.EAST, firstType, -10, SpringLayout.WEST, descriptionArea);
		baseLayout.putConstraint(SpringLayout.NORTH, secondType, 5, SpringLayout.SOUTH, firstType);
		baseLayout.putConstraint(SpringLayout.WEST, secondType, 0, SpringLayout.WEST, firstType);
		baseLayout.putConstraint(SpringLayout.SOUTH, secondType, 35, SpringLayout.SOUTH, firstType);
		baseLayout.putConstraint(SpringLayout.EAST, secondType, 0, SpringLayout.EAST, firstType);
		baseLayout.putConstraint(SpringLayout.NORTH, thirdType, 5, SpringLayout.SOUTH, secondType);
		baseLayout.putConstraint(SpringLayout.WEST, thirdType, 0, SpringLayout.WEST, firstType);
		baseLayout.putConstraint(SpringLayout.SOUTH, thirdType, 35, SpringLayout.SOUTH, secondType);
		baseLayout.putConstraint(SpringLayout.EAST, thirdType, 0, SpringLayout.EAST, firstType);
		baseLayout.putConstraint(SpringLayout.NORTH, fourthType, 5, SpringLayout.SOUTH, thirdType);
		baseLayout.putConstraint(SpringLayout.WEST, fourthType, 0, SpringLayout.WEST, firstType);
		baseLayout.putConstraint(SpringLayout.SOUTH, fourthType, 0, SpringLayout.SOUTH, pokemonPicture);
		baseLayout.putConstraint(SpringLayout.EAST, fourthType, 0, SpringLayout.EAST, firstType);
	}
	
	private void setupListeners()
	{
		
	}
	
}
