package viergewinnt;

public enum Spieler {
	ERSTER ("X"),
	ZWEITER ("O");
	
	private String zeichen;
	private Spieler next;
	
	private Spieler(String zeichen) {
		this.zeichen = zeichen;
	}
	
	public String getZeichen() {
		return this.zeichen;
	}
	
	
	
	public Spieler getNext() {
		return next;
	}
	static {
		ERSTER.next = ZWEITER;
		ZWEITER.next = ERSTER;
	}
	
}
