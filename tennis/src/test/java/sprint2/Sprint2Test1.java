package sprint2;

import org.junit.Assert;
import org.junit.Test;


public class Sprint2Test1 {

	sprint2.userstory1.Set tennisSet = new sprint2.userstory1.Set();

	@Test
	public void testP1EasyWin(){
		for(int i=0; i<(4*6);i++){ //4 points in a game, 6 games to win a set
			tennisSet.p1Scores();
		}
		
		Assert.assertEquals("Player 1 WON the set !", tennisSet.getSetScore());
	}

	@Test
	public void testP2EasyWin(){
		for(int i=0; i<(4*6);i++){ //4 points in a game, 6 games to win a set
			tennisSet.p2Scores();
		}
		
		Assert.assertEquals("Player 2 WON the set !", tennisSet.getSetScore());
	}

	@Test
	public void testSpecialGame(){
		for(int i=0; i<(4*5);i++){
			tennisSet.p1Scores();
		}

		for(int i=0; i<(4*6);i++){
			tennisSet.p2Scores();
		}

		//And now, the special Game
		for(int i=0; i<7; i++){//7 points to win
			tennisSet.p2Scores();
		}

		Assert.assertEquals("Player 2 WON the set !", tennisSet.getSetScore());

	}
}
