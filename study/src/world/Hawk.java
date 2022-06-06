package world;

public class Hawk extends Animal {
	public void go () {
		System.out.println(this.getName() + "は大空を飛んだ");
		System.out.println("hpを5消費した");
		this.setHp(this.getHp() - 5);
		super.go();
	}
}
