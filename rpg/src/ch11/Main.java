package ch11;

import world.Dancer;
import world.Hero;
import world.Matango;
import world.SuperHero;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Matango m = new Matango('A');
		
		Dancer dancer = new Dancer();
		
		dancer.attack(m);
		dancer.dance();
		dancer.run();
		dancer.sleep();
		
		
		Hero hero = new Hero("マシリト");
		hero.attack(m);
		hero.run();
		
		
		SuperHero sh = new SuperHero("まえだ");
		sh.sleep();
		
	}

}
