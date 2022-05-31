package world;

public class Dog extends Animal {
	public void bark() {
		System.out.println(this.name + "は吠えた");
		System.out.println("hpが1減った");
		this.hp -= 1;
	}
}
