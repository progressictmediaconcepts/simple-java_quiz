import javax.swing.JOptionPane;

public class LogicalQuiz {
	
public static void main(String[] args) {
	String question = "what is the capital state of the United States?\n";
	
	question += "A. Los Angelis\n";
	question += "B. Texas\n";
	question += "C. San Francisco\n";
	question += "D. Washington DC\n";
    question += "E. Morocco\n";
	
	String answer = JOptionPane.showInputDialog(question);
	answer = answer.toUpperCase();
	
	if (answer.equals("D")) {
		JOptionPane.showMessageDialog(null, " Correct!");
	}
	else if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("E")) {
		JOptionPane.showMessageDialog(null, "That's not correct, try again");
	}
	else {
		JOptionPane.showMessageDialog(null, "Invalid input, only choose from option A to E");
	}
}
}
