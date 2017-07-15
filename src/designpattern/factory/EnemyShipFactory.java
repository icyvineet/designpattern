package designpattern.factory;

public class EnemyShipFactory {
	public EnemyShip createEnemyShip(String enemyShipName) {
		EnemyShip enemyShip = null;
		if (enemyShipName.equals("B")) {
			enemyShip = new BattleEnemyShip();
		}
		else if (enemyShipName.equals("U")) {
			enemyShip = new UFOEnemyShip();
		} 
		else enemyShip = null;
		
		return enemyShip;
	}
}
