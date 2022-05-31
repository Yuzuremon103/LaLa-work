package world;

public class Rabbit extends Animal{
	public void jump() {
		System.out.println(this.name + "は飛び跳ねた");
		System.out.println("hpを3消費した");
		this.hp -= 3;
	}
}
