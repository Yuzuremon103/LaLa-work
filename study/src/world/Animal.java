package world;

public class Animal {
	public String name;
	public int hp = 10;
	public boolean life = true;
	
	public Animal() {
		this.name = "アニマル";
		if(this.hp > 0) {
			life = true;
		}
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + "は食べた");
		System.out.println("hpが10上がった");
		this.hp += 10;
	}
	
	public void go() {
		System.out.println(this.name + "は走った");
		System.out.println("hpを5消費した");
		this.hp -= 5;
		if(this.hp < 1) {
			dead();
		}
	}
	
	public void dead() {
		life = false;
		System.out.println(this.name + "は死んだ");
	}

}
