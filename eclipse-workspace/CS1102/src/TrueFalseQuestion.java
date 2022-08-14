import javax.swing.*;


public class TrueFalseQuestion extends Question {

	
	TrueFalseQuestion(String question, String answer){
		super(question);
		this.correctAnswer = answer;
		
		JPanel buttons = new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		
	}
	
	void addButton(JPanel buttons, String label) {
		JRadioButton button = new JRadioButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

}
