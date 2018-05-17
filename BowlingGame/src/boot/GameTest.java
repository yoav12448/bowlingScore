package boot;

import bowling.Game;

public class GameTest  {

	private Game game;

	void rolls(int rolls_Number, int pins, Game g) {
		for (int i = 0; i < rolls_Number; i++) g.roll(pins);
	}

	public void newGame() {
		this.game = new Game();
	}

	public boolean testZero() {
		rolls(20, 0, game);
		return 0==game.score();
	}
	

	public boolean testSpare() {
		rolls(16, 0, game);
		game.roll(7);
		game.roll(3);
		game.roll(5);
		game.roll(5);
		game.roll(9);
		return 34==game.score();
	}
	
	public boolean testStrike() {
		game.roll(3);
		game.roll(0);
		game.roll(10);
		game.roll(2);
		rolls(16, 0, game);
		return 17==game.score();
	}
	
	public boolean testRandom() {
		rolls(8, 10, game);
		game.roll(9);
		game.roll(1);
		game.roll(9);
		game.roll(1);
		game.roll(10);
		return 268==game.score();
	}
	public boolean testPerfectGame() {
		rolls(12, 10, game);
		return 300==game.score();
	}
}