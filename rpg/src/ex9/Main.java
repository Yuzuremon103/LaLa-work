package ex9;

import world.Thief;

public class Main {
	public static void heal(int hp) {
		hp += 10;
	}
	
	public static void heal(Thief thief) {
		thief.hp += 10;
	}
	
	
	public static void main(String[] args) {
		Thief t = new Thief("アサカ", 40, 5);
		Thief t2 = new Thief("アサカ", 35);
		Thief t3 = new Thief("アサカ");
		
		int baseHp = 25;
		Thief t4 = new Thief("アサカ", baseHp);
		System.out.println(baseHp + " : " + t4.hp);
		heal(baseHp);
		heal(t4);
		System.out.println(baseHp + " : " + t4.hp);
	}

}
