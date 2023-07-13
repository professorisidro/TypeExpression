package ast;

import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import symbols.Identifier;

public class RuntimeEntity extends JFrame{
	
	private JTextArea txtContent;
	public RuntimeEntity() {
		setTitle("Runtime Entity Program Status ");
		setBounds(0, 0, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		txtContent = new JTextArea();
		txtContent.setBounds(10, 10, 350, 250);
		getContentPane().add(txtContent);
		setVisible(true);
		
	}
	
	public void updateContent(Collection<Identifier> values) {
		StringBuilder strBuilder = new StringBuilder();
		values.stream().forEach(i -> strBuilder.append(i+"\n"));
		txtContent.setText(strBuilder.toString());
	}
	
	

}
