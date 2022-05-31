package world;

public class Hawk extends Animal {
	public void go () {
		System.out.println(this.name + "は大空を飛んだ");
		System.out.println("hpを5消費した");
		this.hp -= 5;
		super.go();
	}
}
