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
	

}
