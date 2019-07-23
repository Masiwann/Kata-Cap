package sprint2;

import org.junit.Assert;
import org.junit.Test;

import sets.SetWithoutTieBreak;


public class Sprint2Test1 {

	SetWithoutTieBreak tennisSet = new SetWithoutTieBreak();

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
	public void testFirstToSeven(){
		for(int i=0; i<(4*5);i++){
			tennisSet.p1Scores();
		}

		for(int i=0; i<(4*6);i++){
			tennisSet.p2Scores();
		}

		//And now 5 - 6
		for(int i=0; i<4; i++){
			tennisSet.p2Scores();
		}

		Assert.assertEquals("Player 2 WON the set !", tennisSet.getSetScore());
	}
}
