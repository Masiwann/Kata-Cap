package sprint1;

import org.junit.Assert;
import org.junit.Test;

import sprint1.userstory1.GameNoDeuce;

public class Sprint1Test1 {
	
	GameNoDeuce tennisGame = new GameNoDeuce();

	@Test
	public void testP1EasyWin(){
		tennisGame.p1Scores();
		tennisGame.p1Scores();
		tennisGame.p1Scores();
		tennisGame.p1Scores();
		
		Assert.assertEquals("Player 1 WON !",tennisGame.checkCurrentScore());
	}
	
	@Test
	public void testP2EasyWin(){
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		
		Assert.assertEquals("Player 2 WON !",tennisGame.checkCurrentScore());
	}
	
	@Test
	public void testCheckGameNotFinished(){
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		tennisGame.p1Scores();
		
		Assert.assertEquals("15-30",tennisGame.checkCurrentScore());
		
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		
		Assert.assertEquals("Player 2 WON !", tennisGame.checkCurrentScore());
	}
	
	@Test
	public void testGameAlreadyFinished(){
		tennisGame.p1Scores();
		tennisGame.p1Scores();
		tennisGame.p1Scores();
		tennisGame.p1Scores();//Game finished ici
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		tennisGame.p2Scores();
		tennisGame.p2Scores();

		Assert.assertEquals("Player 1 WON !",tennisGame.checkCurrentScore());
	}

}
