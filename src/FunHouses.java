
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FunHouses {
	static DrawHouse j = new DrawHouse();
	static Robot h = new Robot();
	static String r;
	static String v;
	static String c;

	public static void main(String[] args) {
		int n = 0;
		r = JOptionPane.showInputDialog(" Do you want peak houses or flat houses(peak or flat)?");
		v = JOptionPane.showInputDialog("What sizes of houses do you want (small, meduim, large)?");
		c = JOptionPane.showInputDialog("What color do you want your houses (green, red, blue)?");
		h.miniaturize();
		h.setSpeed(1000);
		h.moveTo(50, 500);
		if (r.equals("flat")) {

			for (int i = 0; i < 10; i++) {
				j.flatHouse(n, h, v, c);
			}
		}

		else if (r.equals("peak")) {

			for (int i = 0; i < 10; i++) {

				j.peakHouse(n, h, v, c);
			}
		}
	}
}
