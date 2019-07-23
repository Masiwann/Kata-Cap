package games;

public class TieBreak implements IGame{
	
	private int scoreP1;
	private int scoreP2;
	
	public TieBreak(){
		scoreP1 = 0;
		scoreP2 = 0;
	}

	@Override
	public void p1Scores() {
		if (!isFinished()) scoreP1++;		
	}

	@Override
	public void p2Scores() {
		if (!isFinished()) scoreP2++;
	}

	@Override
	public String checkCurrentScore() {
		return scoreP1 + "-" + scoreP2;
	}

	@Override
	//With this version, a player needs at least 7 points and 2 points more than his opponent
	public boolean isFinished() {
		if (scoreP1 >= 7 && (scoreP2 <= (scoreP1 - 2))) return true; 
		if (scoreP2 >= 7 && (scoreP1 <= (scoreP2 - 2))) return true;
		return false;
	}

}
