package ex2;

public class ConcreteGame2 implements AbstractGame {

	@Override
	public Obstacle createObstacle() {
		return new NastyVilain();
	}

	@Override
	public Player createPlayer() {
		return new KungFuGuy();
	}

}
