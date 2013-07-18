package squad;

import java.util.ArrayList;

import speler.Player;

public class Team {

	private ArrayList<Player> team;
	private ArrayList<Player> reserves;
	private ArrayList<Player> substitutes;
	private ArrayList<Player> keepers;
	private ArrayList<Player> midfielders;
	private ArrayList<Player> defenders;
	private ArrayList<Player> attackers;
	
	public Team(ArrayList<Player> keepers, ArrayList<Player> defenders, ArrayList<Player> midfielders, ArrayList<Player> attackers){
		this.keepers = keepers;
		this.defenders = defenders;
		this.midfielders = midfielders;
		this.attackers = attackers;
		team = new ArrayList<Player>();
		int[] res = {4,3,3};
		formation(res);
		reserves = new ArrayList<Player>();
		reservePlayers(res);
		substitutes = new ArrayList<Player>();
		substitutePlayers(reserves);
	}
	
	private ArrayList<Player> formation(int[] order){
		if(order.length == 3 && order[0] + order[1] + order[2] == 10){
			team.add(keepers.get(0));
			for(int i = 0; i<order[0]; i++){
				team.add(defenders.get(i));
			}
			for(int i = 0; i<order[1]; i++){
				team.add(midfielders.get(i));
			}
			for(int i = 0; i<order[2]; i++){
				team.add(attackers.get(i));
			}
			return team;
		}
		return null;
	}
	
	private ArrayList<Player> reservePlayers(int[] order){
		if(order.length == 3 && order[0] + order[1] + order[2] == 10){
			for(int i = 1; i<keepers.size();i++){
				reserves.add(keepers.get(i));
			}
			for(int i = order[0]; i<defenders.size(); i++){
				reserves.add(defenders.get(i));
			}
			for(int i = order[1]; i<midfielders.size(); i++){
				reserves.add(midfielders.get(i));
			}
			for(int i = order[2]; i<attackers.size(); i++){
				reserves.add(attackers.get(i));
			}
			return reserves;
		}
		else{
			return null;
		}
	}
	
	private ArrayList<Player> substitutePlayers(ArrayList<Player> reserve){
		for(int i = 2; i< reserve.size(); i++){
			substitutes.add(reserve.get(i));
		}
		return substitutes;
	}
}
