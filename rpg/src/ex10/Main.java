package ex10;

import world.Hero;
import world.PoisonMatango;

public class Main {
	public static void main(String[] args) {

		PoisonMatango pm = new PoisonMatango('A');
		
		
		Hero h = new Hero();
		pm.attack(h);
		
		
//		SuperHero sh = new SuperHero("アサカ");
//		pm.attack(sh);
		
		h.attack(pm);
//		sh.attack(pm);
	}

}
