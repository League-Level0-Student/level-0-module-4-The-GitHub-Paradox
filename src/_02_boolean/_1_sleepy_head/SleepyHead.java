package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String input = JOptionPane.showInputDialog("What day is it? Weekend(type 1) or not weekend(type 2)?");
        int day = Integer.parseInt(input);
		// Set the boolean isWeekend based on the value they enter
		if(day == 1) {
			System.out.print("You get to sleep in!");
		}
		else {
			System.out.println("Get out of bed and go to school!");
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String input2 = JOptionPane.showInputDialog("What percentage did you get on your test?");
int test = Integer.parseInt(input2);
		// If they scored more than 70, they passed the exam.
if(test >= 70) {
	System.out.print("   Good Job! You Passed!");
}
else {
	System.out.print("   Ha noob");
}
		// Set the boolean passedExam based on their score.
		
		// If the user passed the exam, congratulate them
		
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true

		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed = false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		while(!isRed) {
			String red = JOptionPane.showInputDialog("What color do you want to draw with?");
			if(red.equalsIgnoreCase("red"));
			isRed = true;
		}
		boolean isSquare = false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		while(!isSquare);
			String square = JOptionPane.showInputDialog("What shape do you want to draw?");
			if(square.equalsIgnoreCase("square"));
			isSquare = true;
		}
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
