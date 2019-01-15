package ex2;

public class ConcreteGame1 implements AbstractGame {

	@Override
	public Obstacle createObstacle() {
		return new Puzzle();
	}

	@Override
	public Player createPlayer() {
		return new Kitty();
	}

}
