package chap12;

import world.Matango;
import world.Wand;
import world.Wizard;

public class Main471 {

	public static void main(String[] args) {

		
//		Wizard w = new Wizard();
		Wand wand = new Wand("魔法の杖");
		Wizard w = new Wizard(wand);
		
//		if(w instanceof Wizard) {
//			System.out.println("いいよ");
//		}
//		
////		Character c = w;
//		Wizard w = (Wizard)w;
//		
		Matango m = new Matango();
		
		
		w.setName("アサカ");
		w.attack(m);
		w.fireball(m);

		
////		Wizard w = new Wizard();
//		Character c = new Wizard();
//		
//		if(c instanceof Wizard) {
//			System.out.println("いいよ");
//		}
//		
////		Character c = w;
//		Wizard w = (Wizard)c;
//		
//		Matango m = new Matango();
//		
//		
//		c.name = "アサカ";
//		c.attack(m);
//		c.fireball(m);
		
		
		
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
