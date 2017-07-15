package designpattern.factory;

public class EnemyShip {

	private String name;
	private int damage;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void followHero(){
		System.out.println(name + " is following hero");
	}
	
	public void doDamage(){
		System.out.println(name + "  has done damage = " + damage);
	}
}
