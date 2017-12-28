package pl.epictextbattle;

public class Battle {
	
	//method is responsible for starting fight between two warriors and check the result of the fight
	public static void startFight(Warrior warrior1, Warrior warrior2) {
		while(true) {
			if(getAttackResult(warrior1, warrior2) == "Game Over") {
				System.out.println("Game Over");
				break;
			}
			if(getAttackResult(warrior2, warrior1) == "Game Over") {
				System.out.println("Game Over");
				break;
			}
		}
	}
	
	public static String getAttackResult(Warrior warriorA, Warrior warriorB) {
		int warriorBhealth = warriorB.getHealth();
		int warriorAattack = warriorA.attack();
		int warriorBblock = warriorB.block();
		
		int damage2warriorB = warriorAattack - warriorBblock;
		
		if(damage2warriorB > 0) {
			warriorBhealth = warriorBhealth - damage2warriorB;
			warriorB.setHealth(warriorBhealth);
			System.out.format("%s attacks %s and deals %s damage \n", warriorA.getName(), warriorB.getName(), damage2warriorB);
			System.out.format("%s has %s health \n", warriorB.getName(), warriorB.getHealth());
		} else {
			damage2warriorB = 0;
			System.out.format("%s blocks attack from %s \n", warriorB.getName(), warriorA.getName());
		}
		
		if(warriorBhealth <= 0) {
			System.out.format("%s has died and %s won \n", warriorB.getName(), warriorA.getName());
			return "Game Over";
		} else {
			return "Fight Again";
		}
	}
	
}
