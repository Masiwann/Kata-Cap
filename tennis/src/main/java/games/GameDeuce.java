package games;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GameDeuce implements IGame{
	
	private int scoreP1;
	private int scoreP2;
	private Map<Integer,String> scores;
	
	public GameDeuce(){
		
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
		if (scoreP1 >= 4 && scoreP1 >= scoreP2 + 2){
			return "Player 1 WON !";
		}
		if (scoreP2 >= 4 && scoreP2 >= scoreP1 + 2){
			return "Player 2 WON !";
		}
		
		//Check if DEUCE
		if (scoreP1 == scoreP2 && scoreP1 >= 3){
			return "DEUCE";
		}
		
		//Check if ADV
		if (scoreP1 >= 4 && scoreP1 == scoreP2+1){
			return "ADV Player 1";
		}
		if (scoreP2 >= 4 && scoreP2 == scoreP1+1){
			return "ADV Player 2";
		}
		
		//Else get score
		return scores.get(scoreP1) + "-" + scores.get(scoreP2);
	}
	
	public boolean isFinished(){
		if ((scoreP1 >= 4 && scoreP1 >= scoreP2 + 2) || (scoreP2 >= 4 && scoreP2 >= scoreP1 + 2)){
			return true;
		}
		return false;
	}
	
}
