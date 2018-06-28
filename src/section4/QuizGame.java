package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		
		String answer = JOptionPane.showInputDialog("What is 3+3?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equals("6")||answer.equalsIgnoreCase("six")) {
			score++;
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog("Is ice made of cold water?");
		// 6.  After all the questions have been asked, print the user's score 
		if(answer2.equalsIgnoreCase("yes")||answer2.equalsIgnoreCase("yeah")) {
			score++;
		}
		
		
		String answer3 = JOptionPane.showInputDialog("What is 2x4?");
		if(answer3.equals("8")||answer3.equalsIgnoreCase("eight")) {
			score++;
		}
		
		String answer4 = JOptionPane.showInputDialog("Do tables traditionally have four legs?");
		if(answer4.equalsIgnoreCase("yes")||answer4.equalsIgnoreCase("yeah")) {
			score++;
		}
		
		if(score == 0||score == 1) {
			JOptionPane.showConfirmDialog(null, "Nice try! Your score is " + score);
		}
		else {
		JOptionPane.showConfirmDialog(null, "Congratulations! Your score is " + score);
		}
	}
}
