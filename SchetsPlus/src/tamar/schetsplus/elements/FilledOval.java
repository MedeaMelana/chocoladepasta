package tamar.schetsplus.elements;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class FilledOval extends Oval {

	public FilledOval(Point p1, Point p2, Color c) {
		super(p1, p2, c);
	}

	public void paint(Graphics2D g) {
		g.setColor(super.elementColor);
		g.fillOval(p1.x, p1.y, Math.abs(p2.x - p1.x), Math.abs(p2.y - p1.y));
	}
	
}
