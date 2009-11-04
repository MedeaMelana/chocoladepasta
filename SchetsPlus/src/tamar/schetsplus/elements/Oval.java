package tamar.schetsplus.elements;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Oval extends AbstractElement {

	private boolean filled;

	public Oval(Point p1, Point p2, Color c, boolean filled) {
		super(c);
		this.p1 = p1;
		this.p2 = p2;
		this.filled = filled;
	}

	public void paint(Graphics2D g) {
		g.setColor(getColor());
		if (filled) {
			g.fillOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), Math
					.abs(p2.x - p1.x), Math.abs(p2.y - p1.y));
		} else {
			g.drawOval(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y), Math
					.abs(p2.x - p1.x), Math.abs(p2.y - p1.y));
		}
	}

	public boolean hits(Point mp) {
		if (filled) {
			
		}
//		if () {
//			
//		}	
		return false;
	}

}