package world;

public abstract class Character {
	public String name;
	public int hp;
	
	
	public Character() {}
	
	public Character(String name) {
		this.name = name;
	}
	
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);
	
	public void fireball(Matango m) {
		System.out.println("火を出した");
	}
 	
	public void sleep() {;
		System.out.println(this.name + "は眠った");
		System.out.println("hpが10ポイント回復した");
		this.hp += 10;
	}
}
