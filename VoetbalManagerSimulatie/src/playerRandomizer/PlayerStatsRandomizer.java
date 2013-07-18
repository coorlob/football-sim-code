package playerRandomizer;

import java.util.Random;

public class PlayerStatsRandomizer extends BaseRandomizer {
	
	
	String position;
	Random random = new Random();
	
	public PlayerStatsRandomizer(String position) {
		super();
		
		position(position);
	}
	
	public void setKeeperStats(){
		this.keeperStats += random.nextInt(40) + 20;
		this.attackerStats += random.nextInt(20);
		this.defenderStats += random.nextInt(20);
	}
	
	public void setDefenderStats(){
		this.keeperStats += random.nextInt(20);
		this.attackerStats += random.nextInt(20);
		this.defenderStats += random.nextInt(40) + 20;
	}
	
	public void setMidfielderStats(){
		this.keeperStats += random.nextInt(20);
		this.attackerStats += random.nextInt(40) + 20;
		int rand = random.nextInt(1);
		if(rand == 0 && this.attackerStats + 5 <= 100){
			this.defenderStats = this.attackerStats + random.nextInt(5);
		}
		else if(this.attackerStats -5 >= 60){
			this.defenderStats = this.attackerStats - random.nextInt(5);
		}
		else{
			this.defenderStats = this.attackerStats;
		}
	}
	
	public void setAttackerStats(){
		this.keeperStats += random.nextInt(20);
		this.attackerStats += random.nextInt(40) + 20;
		this.defenderStats += random.nextInt(20);
	}
	
	public void position(String position){
		if(position.equals("Keeper")){
			setKeeperStats();
		}
		else if(position.equals("Defender")){
			setDefenderStats();
		}
		else if(position.equals("Midfielder")){
			setMidfielderStats();
		}
		else if(position.equals("Attacker")){
			setAttackerStats();
		}
	}

	public int getKeeperStats() {
		return keeperStats;
	}

	public int getDefenderStats() {
		return defenderStats;
	}

	public int getAttackerStats() {
		return attackerStats;
	}

	public String getPosition() {
		return position;
	}

}
