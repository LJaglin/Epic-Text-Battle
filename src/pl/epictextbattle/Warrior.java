package pl.epictextbattle;

import java.util.Random;

public class Warrior {

	private String name;
	private int health;
	private int attackMax;
	private int blockMax;
	private Random random;
	
	public Warrior(String name, int health, int attackMax, int blockMax) {
		this.name = name;
		this.health = health;
		this.attackMax = attackMax;
		this.blockMax = blockMax;
		random = new Random();
	}
	
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	//method below generates random value of attack, value cannot be higher than attackMax
	public int attack() {
		return random.nextInt(attackMax);
	}
	
	//method below generates random value of block, value cannot be higher than blockMax
	public int block() {
		return random.nextInt(blockMax);
	}
}
