package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String input = JOptionPane.showInputDialog("How many Nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
int Nickelnum = Integer.parseInt(input);
		// Ask the user how many dimes they have, and convert their answer
String input2 = JOptionPane.showInputDialog("How many Dimes do you have?");
int Dimenum = Integer.parseInt(input2);
		// Ask the user how many quarters they have, and convert their answer
String input3 = JOptionPane.showInputDialog("How many Quarters do you have?");
int Quarternum = Integer.parseInt(input3);
		// Calculate how much money the user has.  Hint: Use a double variable 
System.out.println("You have this much money! " +input+"*0.05 + "+input2+"*0.1 + "+input3+"*0.25!");
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

