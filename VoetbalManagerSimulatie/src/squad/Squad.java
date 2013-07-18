package squad;

import java.util.ArrayList;

import speler.Player;

public class Squad {

	ArrayList<Player> squad;
	ArrayList<Player> keepers;
	ArrayList<Player> defenders;
	ArrayList<Player> midfielders;
	ArrayList<Player> attackers;
	
	public Squad(){
		this.squad = newSquad();
		keepers = new ArrayList<Player>();
		defenders = new ArrayList<Player>();
		midfielders = new ArrayList<Player>();
		attackers = new ArrayList<Player>();
		positions();
		Team teamFromSquad = new Team(keepers,defenders,midfielders,attackers);
	}
	
	public ArrayList<Player> newSquad(){
		int i = 0;
			for(int j = 0; j<4; j++){
				Player speler = new Player("Keeper");
				squad.add(i, speler);
				i++;
			}
			for(int j = 0; j<6; j++){
				Player speler = new Player("Defender");
				squad.add(i, speler);
				i++;
			}
			for(int j = 0; j<6; j++){
				Player speler = new Player("Midfielder");
				squad.add(i, speler);
				i++;
			}
			for(int j = 0; j<6; j++){
				Player speler = new Player("Attacker");
				squad.add(i, speler);
				i++;
			}
			return squad;
		}
	
	public void positions(){
		for(int i = 0; i<this.squad.size(); i++){
			if(this.squad.get(i).getPosition().equals("Keeper")){
				keepers.add(this.squad.get(i));
			}
			else if(this.squad.get(i).getPosition().equals("Defender")){
				defenders.add(this.squad.get(i));
			}
			else if(this.squad.get(i).getPosition().equals("Midfielder")){
				midfielders.add(this.squad.get(i));
			}
			else if(this.squad.get(i).getPosition().equals("Attacker")){
				attackers.add(this.squad.get(i));
			}
		}
	}
}
