package sprint2.userstory2;

public class SpecialGame implements IGame {
	
	private int scoreP1;
	private int scoreP2;
	
	public SpecialGame(){
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
	public boolean isFinished() {
		if (scoreP1 == 7 || scoreP2 == 7) return true; //With this version, if a player reaches 7, end of the specialGame
		return false;

	}
	
}
