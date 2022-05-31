package dq3;

public class Priest {
	public String name = "アルス";
	public int level = 40;
	public int hp = 180;
	public int mp = 301;

	public void hoimi() {
		this.mp -= 3;
		this.hp += 30;
	}
	
	public void bagikurosu() {
		this.mp -= 9;
	}

}
