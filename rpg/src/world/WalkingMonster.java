package world;

public abstract class WalkingMonster extends Monster {
	public int hp = 100;
	public int mp = 10;
	
	public void run() {
		System.out.println("トコトコ走って逃げる");
	}
}
