package world;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	
//	public Wizard() {}
	
	public Wizard(Wand wand) {
		this.setWand(wand);
	}
	
	
	public void heal(Hero h) {
//		h.hp += 10;
//		System.out.println(h.getName() + "のHPを10回復した !");
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した");
	}

	public void attack(Matango m) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	public void fireball(Matango m) {
		System.out.println(this.name + "は火の玉を放った");
		System.out.println("敵に20ポイントのダメージ");
		this.mp -= 5;
		m.hp -= 20;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if(hp < 0) {
			hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("mpは0以上です");
		}
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if(name == null || name.length() <= 2) {
			String msg = "名前が短いです";
			throw new IllegalArgumentException(msg);
		}
		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("杖が必要");
		}
		this.wand = wand;
	}
	
}
