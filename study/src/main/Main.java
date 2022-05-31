package main;

import world.Animal;
import world.Dog;
import world.Hawk;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal animal = new Animal("犬");
		
		
		Dog dog = new Dog();
		dog.name = "犬";
		dog.eat();
		for(int i = 0; i < 10; i++) {
			dog.go();
		}
		dog.go();

		Hawk hawk = new Hawk();
		hawk.name = "鷹";
		hawk.eat();
		hawk.go();
	}

}
