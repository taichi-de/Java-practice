package viergewinnt;

public class Drucker implements Output{
	private Spielbrett feld;

	public Drucker(Spielbrett feld) {
		this.feld = feld;
	}

	public void render() {
		for(int y = feld.getReihen()-1; y >= 0; y--) {
			for(int x = 0; x < feld.getSpalten(); x++) {
				Spielfigur figur = feld.getFigur(x, y);
				if(figur != null) {
					System.out.print(figur.getZeichen());
				}else {
					System.out.print("-");
				}
			}
			System.out.println(" ");
		}
		for(int i = 0; i < feld.getSpalten(); i++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
}
