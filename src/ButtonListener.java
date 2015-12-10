import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class ButtonListener implements ActionListener {
	
	private WordBank wb;
	
	public static final String GENERATE = "generate";
	
	public ButtonListener(WordBank wb) {
		this.wb = wb;
	}
	
	public void actionPerformed(ActionEvent e)
    {
		JButton button = (JButton) e.getSource();
		String command = button.getActionCommand();
        if (command.equals(GENERATE)) {
        	wb.generate();
        }
    }
}
