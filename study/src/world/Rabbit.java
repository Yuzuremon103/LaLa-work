package world;

public class Rabbit extends Animal{
	public void jump() {
		System.out.println(this.getName() + "は飛び跳ねた");
		System.out.println("hpを3消費した");
		this.setHp(this.getHp() - 3);
	}
}
