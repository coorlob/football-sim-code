package club;

import squad.Squad;

public class Club {
	
	private String name;
	private String city;
	private String stadium;
	private int budget;
	private int startBudget;

	
	public Club(){
		Squad clubSquad = new Squad();
		name = setClubName();
		city = setClubCity();
		stadium = setStadiumName();
		startBudget = setStartBudget();
		budget = startBudget;
	}
	
	private String setClubName(){
		return "club dinges";
	}
	
	private String setClubCity(){
		return "Delft";
	}
	
	private String setStadiumName(){
		return "CH Stadium";
	}
	
	private int setStartBudget(){
		return 10000000;
	}
	
	private void setBudget(int n){
		budget = budget + n;
	}
}
