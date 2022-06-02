package world;

public class Dancer extends Character {
	
	public Dancer() {
		this.name = "ダンサー";
	}
	
//	public Dancer(String name) {
//		super(name);
//	}
	
	
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}

	@Override
	public void attack(Matango m) {   // 実装
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
}
