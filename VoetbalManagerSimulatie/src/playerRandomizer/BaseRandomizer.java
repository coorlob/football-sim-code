package playerRandomizer;

import java.util.Random;

public class BaseRandomizer {

	protected int age, keeperStats, defenderStats, attackerStats;
	private String name, surname;
	Random random = new Random();
	
	public BaseRandomizer(){
		this.age = setRandomAge();
		this.name = setRandomName();
		this.surname = setRandomSurname();
		this.keeperStats = 40;
		this.defenderStats = 40;
		this.attackerStats = 40;
	}
	
	public int setRandomAge(){
		this.age = random.nextInt(20) +15;
		return this.age;
	}
	
	public String setRandomName(){
		this.name = "aaaaaa";
		return this.name;
	}
	
	public String setRandomSurname(){
		this.surname = "bbbbbb";
		return this.surname;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	
}
