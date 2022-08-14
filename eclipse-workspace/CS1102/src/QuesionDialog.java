import java.awt.event.*;

import javax.swing.*;
import java.awt.*;

public class QuesionDialog extends JDialog implements ActionListener {
	String answer;
	
	public void actionPerformed(ActionEvent e) {
		answer = e.getActionCommand();
		dispose();
	}

}
