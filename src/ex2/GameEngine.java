package ex2;

public class GameEngine {
	
	AbstractGame game;
	
	public GameEngine(int i) {
		if(i == 1) {
			game = new ConcreteGame1();
		}
		else if(i == 2) {
			game = new ConcreteGame2();
		}
		else {
			game = null;
		}
	}
	
	public void startGame() {
		if(game != null) {
			game.createObstacle();
			game.createPlayer();
		}
	}
	
}
