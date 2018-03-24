import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fortune_Cookie implements ActionListener {

	public static void main(String[] args) {
		Fortune_Cookie fc= new Fortune_Cookie();
		fc.showButton();


		
		
		
	}
	
 void	showButton(){
		System.out.println("Button");
		JFrame f= new JFrame();
		f.setVisible(true);
JButton b= new JButton();
		
		f.add(b);
		
		b.addActionListener(this);
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}


