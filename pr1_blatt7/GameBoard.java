package pr1_blatt7;

import java.util.Random;

public class GameBoard {
	public static final int EMPTY = 0;
	public static final int SNAKEHEAD = 1;
	public static final int SNAKEBODY = 2;
	public static final int FOOD = 3;

	private int cols, rows;
	private Snake snake;
	private Random random = new Random();
	private int foodX, foodY;
	private int currentPoints;
	private int maxPoints;
	private int oldSnakeX;
	private int oldSnakeY;

	public GameBoard(int cols, int rows) {
		this.cols = cols;
		this.rows = rows;

		// TODO:2-1
		snake = new Snake(random.nextInt(cols), random.nextInt(rows), new Direction());
		setRandomFoodPosition();
	}

	public void setRandomFoodPosition() {
		// TODO:2-2
		int x,y;
		do{
			x = random.nextInt(cols);
			y = random.nextInt(rows);
		}while(getFieldContent(x,y) != EMPTY);

		foodX = x;
		foodY = y;
	}

	public int getRows() { return rows; }
	public int getCols() { return cols; }
	public int getCurrentPoints() { return currentPoints; }
	public int getMaxPoints() { return maxPoints; }

	private void resetPoints() {
		// TODO:2-3f
		if(currentPoints > maxPoints){
			maxPoints = currentPoints;
		}
		currentPoints = 0;
	}

	public void moveSnake(Direction newDirection) {
		// TODO:2-3a
		if(newDirection != null){
			snake.setDirection(newDirection);
		}

		// TODO:2-3c,d
		if(snake.getHeadX() >= cols || snake.getHeadX() < 0 || snake.getHeadY() >= rows || snake.getHeadY() < 0 || snake.hasBody(snake.calculateNewX(), snake.calculateNewY())){
			snake = new Snake(oldSnakeX, oldSnakeY, new Direction());
			resetPoints();
		}
		oldSnakeX = snake.getHeadX();
		oldSnakeY = snake.getHeadY();

		// TODO:2-3e
		if(getFieldContent(foodX, foodY) == SNAKEHEAD){
			snake.extendBody();
			currentPoints++;
			setRandomFoodPosition();
		}

		//TODO:2-3b
		snake.moveSnake();
	}

	/**
	 * Gets called by the renderer and returns which
	 * element is on the playing field.
	 */
	public int getFieldContent(int x, int y) {
		if (snake.hasHead(x, y))
			return SNAKEHEAD;
		if (snake.hasBody(x, y))
			return SNAKEBODY;
		if (x == foodX && y == foodY)
			return FOOD;

		return EMPTY;
	}

	public Direction getCurrentSnakeDirection() {
		return snake.getDirection();
	}
}
