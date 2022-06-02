package world;

public class PoisonMatango extends Matango {
	public int pcount = 5;
	public int hp = 20;
	
	
	public PoisonMatango(char suffix) {
		super(suffix);
//		this.pcount = 10;
	}
	
	public void attack(Hero h) { // オーバーライド Hero指定すればSuperHeroにも有効
		System.out.println("PoisonMatangoの攻撃 !");
//		super.attack(h);    // 親のattack()を読む
		if(this.pcount != 0) {
			System.out.println(this.suffix + "はさらに毒の胞子をばら撒いた");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(h.name + "に" + damage + "ポイントの毒ダメージ");
			System.out.println(h.name + "のHP :" + h.hp);
			pcount--;
			System.out.println("");
			System.out.println("毒攻撃の残り回数" + pcount);
		}
	}

}
