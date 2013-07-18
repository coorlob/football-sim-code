package speler;

import playerRandomizer.PlayerStatsRandomizer;

public class Player {

	private String name, surname, position;
	private int age, keeperStats, defenseStats, attackStats;
	
	public Player(String position){
		PlayerStatsRandomizer random = new PlayerStatsRandomizer(position);
		this.name = random.getName();
		this.surname = random.getSurname();
		this.position = position;
		this.age = random.getAge();
		this.keeperStats = random.getKeeperStats();
		this.defenseStats = random.getDefenderStats();
		this.attackStats = random.getAttackerStats();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surname;
	}

	public void setSurName(String surName) {
		this.surname = surName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getKeeperstats() {
		return keeperStats;
	}

	public void setKeeperstats(int keeperstats) {
		this.keeperStats = keeperstats;
	}

	public int getDefenseStats() {
		return defenseStats;
	}

	public void setDefenseStats(int defenseStats) {
		this.defenseStats = defenseStats;
	}

	public int getAttackStats() {
		return attackStats;
	}

	public void setAttackStats(int attackStats) {
		this.attackStats = attackStats;
	}

	@Override
	public String toString() {
		return "SpelerBasis [name=" + name + ", surname=" + surname
				+ ", position=" + position + ", age=" + age + ", keeperStats="
				+ keeperStats + ", defenseStats=" + defenseStats
				+ ", attackStats=" + attackStats + "]";
	}
	
	
}
