import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowDemo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public FlowDemo() {
		setTitle("Flow Demo");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		for (int i = 0; i < 6; i++) {
			JButton b = new JButton("Botão: "+(i+1));
			cp.add(b);
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		new FlowDemo().setVisible(true);

	}

}
