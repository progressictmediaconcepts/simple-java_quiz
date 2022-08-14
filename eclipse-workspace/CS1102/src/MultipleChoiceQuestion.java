import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	
	void addChoice(String name, String label) {
		JPanel choice = new JPanel(new BorderLayout());
		JRadioButton button = new JRadioButton(name);
		button.addActionListener(question); 
		choice.add(button, BorderLayout.WEST);
		choice.add(new JLabel (label+ "           ", JLabel.LEFT), BorderLayout.CENTER);
		question.add(choice);
	}
	
	void check() {
		nQuestions++;
		
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, " Correct!");
			nCorrect++;
		}
		else if (answer != correctAnswer) {
			JOptionPane.showMessageDialog(null, "That's not correct, try again");
		}
		else {
			JOptionPane.showMessageDialog(null, "Invalid input, only choose from option A to E");
		}
	}
	

	MultipleChoiceQuestion(String querry, String a, String b, String c, String d, String e, String answer) {
		super(querry);
		
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);
		initQuestionDialog();
		
		correctAnswer = answer;		
	}

}
