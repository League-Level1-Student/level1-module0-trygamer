
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FunHouses {
	static Robot h = new Robot();
	static String v = JOptionPane.showInputDialog("What sizes of houses do you want (small, meduim, large)?");
	static String c = JOptionPane.showInputDialog("What color do you want your houses (green, red, blue)?");

	public static void main(String[] args) {
		int n = 0;
		h.miniaturize();
		h.setSpeed(1000);
		h.moveTo(50, 500);
		for (int i = 0; i < 10; i++) {
			flatHouse(n);
		}
	}

	public static void flatHouse(int n) {

		String s = "small";
		String m = "meduim";
		String l = "large";

		if (v.equals(s)) {
			n = 60;
		} else if (v.equals(m)) {
			n = 120;
		} else if (v.equals(l)) {
			n = 250;
		}

		String g = "green";

		String r = "red";

		String b = "blue";

		if (c.equals(g)) {
			h.setPenColor(0, 255, 0);
		} else if (c.equals(r)) {
			h.setPenColor(255, 0, 0);
		} else if (c.equals(b)) {
			h.setPenColor(0, 0, 255);
		}

		h.setSpeed(10);
		h.penDown();

		h.move(n);
		h.turn(90);
		h.move(30);
		h.turn(90);
		h.move(n);
		h.turn(-90);
		h.setPenColor(0, 255, 0);
		h.move(20);
		h.turn(-90);

	}

}
