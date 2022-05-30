package world;

public class Hero {
	public String name;
	public int hp;
	
	
	public Hero() {}
	public Hero(String name) {
		this.name = name;
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した ! ");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
