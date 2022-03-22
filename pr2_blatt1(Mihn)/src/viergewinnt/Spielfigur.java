package viergewinnt;

public class Spielfigur {
	private Spieler spieler;

	public Spielfigur(Spieler spieler) {
		this.spieler = spieler;
	}

	public Spieler getSpieler() {
		return this.spieler;
	}

	public String getZeichen() {
		return spieler.getZeichen();
	}
}
