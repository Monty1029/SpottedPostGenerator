import java.awt.*;
import javax.swing.*;

public class GUI {
	
	private JFrame frame;
	private JTextArea textArea;
	private JButton generateButton;
	private ButtonListener bl;
	
	public GUI(WordBank wb) {		
		bl = new ButtonListener(wb);
		createAndShowGUI();
	}
	
	public void addComponentsToPane(Container pane) {
		pane.setLayout(new GridLayout(2,1));
		textArea = new JTextArea();
		textArea.setBackground(new Color(204,255,255));
		textArea.setEditable(false);
		generateButton = new JButton("Generate!");
		generateButton.setBackground(new Color(139,217,255));
		generateButton.addActionListener(bl);
		generateButton.setActionCommand(ButtonListener.GENERATE);
		pane.add(textArea);
		pane.add(generateButton);
		frame.setVisible(true);
		frame.setSize(400, 150);
	}
	
	public void createAndShowGUI() {
		frame = new JFrame("Spotted Post Generator");
		addComponentsToPane(frame.getContentPane());
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}
}
