import org.jointheleague.graphical.robot.Robot;

public class DrawHouse {

	public void flatHouse(int n, Robot h, String v, String c) {

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

		h.setSpeed(100);
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

	public void peakHouse(int n, Robot h, String v, String c) {

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

		h.setSpeed(100);
		h.penDown();

		h.move(n);
		h.turn(60);
		h.move(30);
		h.turn(60);
		h.move(30);
		h.turn(60);
		h.move(n);
		h.turn(-90);
		h.setPenColor(0, 255, 0);
		h.move(20);
		h.turn(-90);

	}

}
