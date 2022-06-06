package ex13;

import world.Wand;
import world.Wizard;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Hero h = new Hero();
//		h.setName("まえだ");
		
		
		Wand wand = new Wand("こおりのつえ");
		wand.setName("ほのおのつえ");
		System.out.println(wand.getName());
		wand.setPower(32.0);
		System.out.println(wand.getName() + "の攻撃力は" + wand.getPower() + "です");

		Wizard w = new Wizard(wand);
//		w.heal(h);
		
	}

}
