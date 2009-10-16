/**
 * A Java applet that generates the gameboard Reversi.
 * 
 * @author Tamar van Steenbergen, student no. 3233308
 */

// the eight directions
public enum Direction {

	N(0, -1), NE(1, -1), E(1, 0), SE(1, 1), S(0, 1), SW(-1, 1), W(-1, 0), NW(
			-1, -1);

	public final int dx;
	public final int dy;

	Direction(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}

}
