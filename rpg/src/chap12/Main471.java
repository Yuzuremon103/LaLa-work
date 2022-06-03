package chap12;

import world.Character;
import world.Matango;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {

//		Wizard w = new Wizard();
		Character c = new Wizard();
		
		if(c instanceof Wizard) {
			System.out.println("いいよ");
		}
		
//		Character c = w;
		Wizard w = (Wizard)c;
		
		Matango m = new Matango();
		
		
		c.name = "アサカ";
		c.attack(m);
		c.fireball(m);
		
		
		
//		Character ch = new Wizard();
//		
//		if(ch instanceof Hero) {
//			Hero h = (Hero)ch;
//			h.fireball(m);
//			h.attack(m);
//		} else {
//			System.out.println("cのインスタンスはHeroではない");	
//		}
	}

}
