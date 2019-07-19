package kata.tennis.sprint1.userstory1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GameNoDeuce {
	
	private int scoreP1;
	private int scoreP2;
	private Map<Integer,String> scores;
	
	
	public GameNoDeuce(){
		scoreP1 = 0;
		scoreP2 = 0;
		
		//Initialize immutable map pour les scores possible.
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(0,"0");
		map.put(1,"15");
		map.put(2,"30");
		map.put(3,"40");
		scores = Collections.unmodifiableMap(map);
	}
	
	public void p1Scores(){
		//To avoid scoring after a finished set
		if (!isFinished()) scoreP1++;
	}
	
	public void p2Scores(){
		//To avoid scoring after a finished set
		if (!isFinished()) scoreP2++;
	}
	
	public String checkCurrentScore(){
		//Check first if there is a winner
		if (scoreP1 == 4) return "Player 1 WON !";
		if (scoreP2 == 4) return "Player 2 WON !";
		
		//Else get score
		return scores.get(scoreP1) + "-" + scores.get(scoreP2);
	}
	
	public boolean isFinished(){
		if (scoreP1 == 4 || scoreP2 == 4){
			return true;
		}
		return false;
	}
}
