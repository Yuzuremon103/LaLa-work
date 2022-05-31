package world;

public class SuperHero extends Hero{
	boolean flying;
	
	
	public SuperHero() {
		super();
		System.out.println("SuperHeroのコンストラクタが動作");
	}
	
	public SuperHero(String name) {
		super(name);   // Hero.javaのフィールドを呼び出す
	}
	
	
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	
	public void run() {
		System.out.println(this.name + "は撤退した。");
	}

}
