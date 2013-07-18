package competition;

import java.util.ArrayList;

import club.Club;

public class Competition {

	private String name;
	private String country;
	private int totalClubs;
	private ArrayList<Club> clubs;
	
	public Competition(){
		this.name = setName();
		this.country = setCountry();
		this.totalClubs = setAmountOfClubs();
		clubs = new ArrayList<Club>();
		createClubs();
	}
	
	private String setName(){
		return "Eredivisie";
	}
	
	private String setCountry(){
		return "The Netherlands";
	}
	
	private int setAmountOfClubs(){
		return 18;
	}
	
	private ArrayList<Club> createClubs(){
		for(int i = 0; i<totalClubs; i++){
			Club res = new Club();
			clubs.add(res);
		}
		return clubs;
	}
	
}
