package pr1_blatt7;

import java.util.Random;

public class Direction {
	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;

	private int d;

	public Direction(int d) {
		// TODO:1-1
		this.d = d;
	}

	public Direction() {
		// TODO:1-1
		this(new Random().nextInt(4));
	}

	public int getDirection() {
		// TODO:1-2
		return d;
	}

	public String toString() {
		// TODO:1-3
		switch(d){
			case 0: return "UP";// -> case UP: return "UP";
			case 1: return "DOWN";
			case 2: return "LEFT";
			case 3: return "RIGHT";
		}

		return "THIS SHOULD BE IMPLEMENTED";
	}
}
