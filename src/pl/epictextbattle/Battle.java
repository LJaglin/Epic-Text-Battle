package pl.epictextbattle;

public class Battle {
	
	//method below starts fight between two warriors
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
