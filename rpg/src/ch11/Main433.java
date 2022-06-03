package ch11;

import world.DeathBat;
import world.Goblin;
import world.Werewolf;

public class Main433 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Goblin goblin = new Goblin();
		goblin.attack();
		goblin.run();
		goblin.hp = 120;
		goblin.mp = 8;
		System.out.println("HP : " + goblin.hp);
		System.out.println("MP : " + goblin.mp);
		System.out.println("");
		
		
		Werewolf w = new Werewolf();
		w.attack();
		w.run();
		System.out.println("HP : " + w.hp);
		System.out.println("MP : " + w.mp);
		System.out.println("");
		
		
		DeathBat db = new DeathBat();
		db.attack();
		db.run();
		System.out.println("HP : " + db.hp);
//		System.out.println("MP : " + db.mp);
		
//		Hero h = new Hero("田中");
//		h.sleep();
//		
//		
//		SuperHero sh = new SuperHero("まえだ");
//		sh.sleep();


		
	}

}
