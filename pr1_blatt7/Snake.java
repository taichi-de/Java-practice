package pr1_blatt7;

public class Snake {
	private SnakePart head;
	private Direction direction;
	private boolean extendBody = false;

	public Snake(int headX, int headY, Direction direction) {
		head = new SnakePart(headX, headY, null, null);//prev: null, next: null
		this.direction = direction;
	}

	public void extendBody() { extendBody = true; }

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Direction getDirection() { return this.direction; }

	public void moveSnake() {
		// TODO:3-4
		head = new SnakePart(calculateNewX(), calculateNewY(), null, head);//prev: null
		head.getNext().setPrev(head);

		if(!extendBody){
			SnakePart nextPart = head;
			while(nextPart.hasNext()){
				nextPart = nextPart.getNext();
			}
			nextPart.getPrev().setNext(null);
		}
		extendBody = false;
	}

	public int calculateNewX() {
		// TODO:3-1
		switch(direction.getDirection()){
			case 0: return head.getX();
			case 1: return head.getX();
			case 2: return head.getX()-1;
			case 3: return head.getX()+1;
		}
		return 0;
	}

	public int calculateNewY() {
		// TODO:3-1
		switch(direction.getDirection()){
			case 0: return head.getY()-1;
			case 1: return head.getY()+1;
			case 2: return head.getY();
			case 3: return head.getY();
		}
		return 0;
	}

	public int getHeadX() { return head.getX(); }

	public int getHeadY() { return head.getY(); }

	/*
	 * Returns if the head of the snake is on position (x, y)
	 */
	public boolean hasHead(int x, int y) {
		return x == getHeadX() && y == getHeadY();
	}

	public boolean hasBody(int x, int y) {
		// TODO:3-3
		SnakePart nextPart = head;

		while(nextPart.hasNext()){
			if(nextPart.getX() == x && nextPart.getY() == y){
				return true;
			}
			nextPart = nextPart.getNext();
		}
		return nextPart.getX() == x && nextPart.getY() == y;
	}
}

class SnakePart {
	private SnakePart prev;
	private SnakePart next;
	private int x, y;

	public SnakePart(int x, int y, SnakePart prev, SnakePart next) {
		this.x = x;
		this.y = y;
		this.prev = prev;
		this.next = next;
	}

	public boolean hasNext() { return next != null; }

	public SnakePart getPrev() { return prev; }
	public SnakePart getNext() { return next; }

	public void setPrev(SnakePart p) { prev = p; }
	public void setNext(SnakePart n) { next = n; }

	public int getX() { return x; }
	public int getY() { return y; }

}
