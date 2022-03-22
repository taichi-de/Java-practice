package viergewinnt;

public class Spielbrett {
	private Spielfigur[][] feld;
	private int lastX;
	private int lastY;
	private int spalten;
	private int reihen;

	public Spielbrett(int reihen,  int spalten) {
		feld = new Spielfigur[spalten][reihen];
		this.spalten = spalten;
		this.reihen = reihen;
		lastX = 1;
		lastY = 1;
	}

	public boolean platzieren(Spielfigur figur, int x) {
		if(x >= 0 && x < this.spalten) {
			for(int y = 0; y < this.reihen; y++) {
				if(feld[x][y] == null) {
					feld[x][y] = figur;
					lastX = x;
					lastY = y;
					return true;
				}
			}
		}
		return false;
	}

	public int getSpalten() { return this.spalten; }

	public int getReihen() { return this.reihen; }

	public int getLastX() { return this.lastX; }

	public int getLastY() { return this.lastY; }

	public Spielfigur getFigur(int x, int y) { return feld[x][y]; }
}
