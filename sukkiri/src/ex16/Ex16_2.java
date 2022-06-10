package ex16;

import java.util.ArrayList;
import java.util.List;

public class Ex16_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero("まえだ");
		Hero h2 = new Hero("ミナト");
		
		List<Hero> h = new ArrayList<>();
		h.add(h1);
		h.add(h2);
		
		for (Hero hero : h) {
			System.out.println(hero.getName());
		}
	}

}
