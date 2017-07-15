package designpattern.factory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "U";
		
		EnemyShip es = null;
		
		EnemyShipFactory esf = new EnemyShipFactory();
		es = esf.createEnemyShip(userInput);
		
		
		
		doStuff(es);
		

	}

	public static void doStuff(EnemyShip es){
		es.doDamage();
		es.followHero();
	}
	
}
