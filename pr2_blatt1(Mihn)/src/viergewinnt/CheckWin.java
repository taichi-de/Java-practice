package viergewinnt;

public class CheckWin {
	private static int lastX;
	private static int lastY;
	private static Spieler spieler;
	private static int reihen;
	private static int spalten;
	private static int counter;

	public static boolean checkFour(Spielbrett feld) {
		lastX = feld.getLastX();
		lastY = feld.getLastY();
		spieler = feld.getFigur(lastX, lastY).getSpieler();
		reihen = feld.getReihen();
		spalten = feld.getSpalten();

		if (horizontal(feld) || vertikal(feld) || diagonalLinksUnten(feld) || diagonalRechtsOben(feld)
				|| diagonalLinksOben(feld) || diagonalRechtsUnten(feld)) {
			return true;
		}
		return false;
	}

	private static boolean horizontal(Spielbrett feld) {
		counter = 0;
		for (int i = lastX - 1; i >= 0; i--) {
			if (feld.getFigur(i, lastY) == null || feld.getFigur(i, lastY).getSpieler() != spieler) {
				break;
			} else {
				counter++;
			}
		}

		for (int i = lastX + 1; i < spalten; i++) {
			if (feld.getFigur(i, lastY) == null || feld.getFigur(i, lastY).getSpieler() != spieler) {
				break;
			} else {
				counter++;
			}
		}
		if (counter == 3) {
			return true;
		}

		return false;
	}

	private static boolean vertikal(Spielbrett feld) {
		counter = 0;
		for (int i = lastY - 1; i >= 0; i--) {
			if (feld.getFigur(lastX, i) == null || feld.getFigur(lastX, i).getSpieler() != spieler) {
				break;
			} else {
				counter++;
			}
		}

		for (int i = lastY + 1; i < reihen; i++) {
			if (feld.getFigur(lastX, i) == null || feld.getFigur(lastX, i).getSpieler() != spieler) {
				break;
			} else {
				counter++;
			}
		}
		if (counter == 3) {
			return true;
		}
		return false;
	}

	private static boolean diagonalLinksUnten(Spielbrett feld) {
		counter = 0; //counter erst beim dritten wieder auf 0 sonst ist falsch
		int j = lastY - 1;
		for (int i = lastX - 1; i >= 0; i--) {
			if(j < 0)
				break;
			if (j >= 0) {
				if (feld.getFigur(i, j) == null || feld.getFigur(i, j).getSpieler() != spieler) {
					break;
				} else {
					counter++;
				}
			}
			j--;
		}
		if(counter == 3) {
			return true;
		}

		return false;
	}

	private static boolean diagonalRechtsOben(Spielbrett feld) {
		int j = lastY + 1;
		for (int i = lastX + 1; i < feld.getSpalten(); i++) {
			if (j >= feld.getReihen())
				break;
			if (j < feld.getReihen()) {
				if (feld.getFigur(i, j) == null || feld.getFigur(i, j).getSpieler() != spieler) {
					break;
				} else {
					counter++;
				}
			}
			j++;
		}
		if(counter == 3) {
			return true;
		}
		return false;
	}

	private static boolean diagonalLinksOben(Spielbrett feld) {
		counter = 0;
		int j = lastY + 1;
		for (int i = lastX - 1; i >= 0; i--) {
			if (j >= feld.getReihen())
				break;
			if (j < feld.getReihen()) {
				if (feld.getFigur(i, j) == null || feld.getFigur(i, j).getSpieler() != spieler) {
					break;
				} else {
					counter++;
				}
			}
			j++;
		}
		if(counter == 3) {
			return true;
		}

		return false;
	}

	private static boolean diagonalRechtsUnten(Spielbrett feld) {
		int j = lastY - 1;
		for (int i = lastX + 1; i < feld.getSpalten(); i++) {
			if (j < 0)
				break;
			if (j >= 0) {
				if (feld.getFigur(i, j) == null || feld.getFigur(i, j).getSpieler() != spieler) {
					break;
				} else {
					counter++;
				}
			}
			j--;
		}
		if(counter == 3) {
			return true;
		}

		return false;
	}
}
