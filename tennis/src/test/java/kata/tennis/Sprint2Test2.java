package kata.tennis;

import org.junit.Assert;
import org.junit.Test;


public class Sprint2Test2 {

	sprint2.userstory2.Set tennisGame = new sprint2.userstory2.Set();

	@Test
	public void testP1EasyWin(){
		for(int i=0; i<(4*6);i++){ //4 points in a game, 6 games to win a set
			tennisGame.p1Scores();
		}
		
		Assert.assertEquals("Player 1 WON the set !", tennisGame.getSetScore());
	}

	@Test
	public void testP2EasyWin(){
		for(int i=0; i<(4*6);i++){ //4 points in a game, 6 games to win a set
			tennisGame.p2Scores();
		}
		
		Assert.assertEquals("Player 2 WON the set !", tennisGame.getSetScore());
	}

	@Test
	public void testSpecialGame(){
		for(int i=0; i<(4*5);i++){
			tennisGame.p1Scores();
		}

		for(int i=0; i<(4*6);i++){
			tennisGame.p2Scores();
		}

		//And now, the special Game
		for(int i=0; i<7; i++){//7 points to win
			tennisGame.p2Scores();
		}

		Assert.assertEquals("Player 2 WON the set !", tennisGame.getSetScore());

	}


	@Test
	public void testTieBreak(){
		for(int i=0; i<(4*5);i++){
			tennisGame.p1Scores();
		}

		for(int i=0; i<(4*6);i++){
			tennisGame.p2Scores();
		}

		//Currently 6-5
		for(int i=0; i<7; i++){//7 points to win
			tennisGame.p1Scores();
		}

		//And now, the tiebreak game
		for(int i=0; i<7; i++){//7 points to win
			tennisGame.p1Scores();
		}

		//Currenlty 7-6, not enough
		for(int i=0; i<7; i++){//7 points to win
			tennisGame.p1Scores();
		}

		Assert.assertEquals("Player 1 WON the set !", tennisGame.getSetScore());


	}

}
