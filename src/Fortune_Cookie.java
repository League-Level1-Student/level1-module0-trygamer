import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_Cookie implements ActionListener {
	JButton b = new JButton();

	public static void main(String[] args) {
		Fortune_Cookie fc = new Fortune_Cookie();
		fc.showButton();

	}

	void showButton() {
		System.out.println("Button");
		JFrame f = new JFrame();
		f.setVisible(true);

		f.add(b);

		b.addActionListener(this);

		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		System.out.println("mouse clicked");

		JButton Fortune = (JButton) e.getSource();

		if (Fortune == b) {
			b.setText("Woohoo");

			int rand = new Random().nextInt(5);

			if (rand == 1) {

				JOptionPane.showMessageDialog(null, "You are the best person in the world");
			}

			else if (rand == 2) {

				JOptionPane.showMessageDialog(null, "One day you will die");
			}

			else if (rand == 3) {

				JOptionPane.showMessageDialog(null, "You will die in 24 hours");
			}

			else if (rand == 4) {

				JOptionPane.showMessageDialog(null, "You are going to play roblox in 24 hours");
			} else if (rand == 0) {
				JOptionPane.showMessageDialog(null, "OOOOOOOOOOOOOOOOOOOOOOFFF");

			}
		}

	}

}
