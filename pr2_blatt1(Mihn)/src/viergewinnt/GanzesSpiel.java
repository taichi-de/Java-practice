package viergewinnt;

public class GanzesSpiel {

	public static void main(String[] args) {
		Eingabe e = new Eingabe();
		System.out.println("Wie viele Spalten?: ");
		int spalte = e.setSpalten();
		System.out.println("Wie viele Reihen?: ");
		int reihe = e.setReihen();
		
		Spielbrett feld = new Spielbrett(reihe, spalte);
		Output drucken = new Drucker(feld);
		Spieler spieler = Spieler.ERSTER;
		
		
		do {
			System.out.println("In welche Spalte reinlegen?");
			if(!feld.platzieren(new Spielfigur(spieler), e.getEingabe())) {
				System.out.println("Falsche Eingabe, geb nochmal ein!");
				continue;
			}
			drucken.render();
			spieler = spieler.getNext(); 
			if(!CheckWin.checkFour(feld)) {
				if(spieler.getNext() == Spieler.ERSTER) {
					System.out.println("O ist dran");
				}
				if(spieler.getNext() == Spieler.ZWEITER) {
					System.out.println("X ist dran");
				}
			}
			
		}while(!CheckWin.checkFour(feld));
		
		if(spieler.getNext() == Spieler.ERSTER) {
			System.out.println("X hat gewonnen!");
		}
		if(spieler.getNext() == Spieler.ZWEITER) {
			System.out.println("O hat gewonnen!");
		}
		
	}

}
