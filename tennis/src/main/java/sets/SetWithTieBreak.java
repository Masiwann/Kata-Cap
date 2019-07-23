package sets;

import games.IGame;
import games.TieBreak;
import games.GameDeuce;

public class SetWithTieBreak {

	private int p1SetScore;
	private int p2SetScore;
	private IGame currentGame;

	public SetWithTieBreak(){
		p1SetScore = 0;
		p2SetScore = 0;
		currentGame = new GameDeuce();
	}

	public void p1Scores(){
		//To avoid scoring after a finished set
		if (!isFinished()){
			currentGame.p1Scores();

			if(currentGame.isFinished()){
				p1SetScore++;
				if(p1SetScore >= 6 && p2SetScore >= 6){
					currentGame = new TieBreak();
				} else {
					currentGame = new GameDeuce();
				}
			}
		}
	}

	public void p2Scores(){
		//To avoid scoring after a finished set
		if (!isFinished()){
			currentGame.p2Scores();

			if(currentGame.isFinished()){
				p2SetScore++;
				if(p2SetScore >= 6 && p1SetScore >= 6){
					currentGame = new TieBreak();
				}
				else {
					currentGame = new GameDeuce();
				}
			}
		}
	}

	//Get the current set score
	public String getCurrentGameScore(){
		return currentGame.checkCurrentScore();
	}

	//Get the set score (games won)
	public String getSetScore(){
		if (isFinished()){
			if ((p1SetScore == 6 && p2SetScore <= 4) || p1SetScore == 7 ){
				return "Player 1 WON the set !";
			}
			else if ((p2SetScore == 6 && p1SetScore <= 4) || p2SetScore == 7 ){
				return "Player 2 WON the set !";
			}
		}

		return "Player 1: "+ p1SetScore +" Game(S) - Player 2: " + p2SetScore + " Game(S)";
	}

	public boolean isFinished(){
		if (p1SetScore == 6){
			if (p2SetScore <= 4){
				return true;
			}
		}
		if (p2SetScore == 6){
			if (p1SetScore <= 4){
				return true;
			}
		}
		if (p1SetScore == 7 || p2SetScore == 7) return true;
		return false;
	}

}
