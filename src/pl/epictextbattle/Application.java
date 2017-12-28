package pl.epictextbattle;

public class Application {
	
	public static void main(String[] args) {
		Warrior spartacus = new Warrior("Spartacus", 1000, 200, 50);
		Warrior commodus = new Warrior("Commodus", 2000, 80, 80);
		
		//invoke method startFight
		Battle.startFight(spartacus, commodus);
	}

}
