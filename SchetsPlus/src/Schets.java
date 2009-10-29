import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Color;
//import java.util.LinkedList;
import java.util.LinkedList;
import java.util.List;

import tamar.schetsplus.elements.Element;

class Schets {
//	private BufferedImage bitmap;
	private List<Element> elements;

	Schets() {
		elements = new LinkedList<Element>();
	}

	public void teken(Graphics g) {
		for (Element e : elements) {
			System.out.println("Teken: " + e);
			e.paint((Graphics2D) g);
		}
	}

	public void resize(int w, int h) {
//		if (w != bitmap.getWidth() || h != bitmap.getHeight()) {
//			BufferedImage nieuw = new BufferedImage(w, h,
//					BufferedImage.TYPE_INT_RGB);
//			Graphics g = nieuw.getGraphics();
//			g.setColor(Color.WHITE);
//			g.fillRect(0, 0, w, h);
//			g.drawImage(bitmap, 0, 0, null);
//			bitmap = nieuw;
//		}
	}

	public void addElement(Element e) {
		elements.add(e);
	}
	
	public Graphics getBitmapGraphics() {
//		return bitmap.getGraphics();
		return null;
	}

	public void clear() {
		elements.clear();
	}
}