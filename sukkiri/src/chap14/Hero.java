package chap14;

public class Hero {
	public String name;
	public int hp;
	public static int money;
	
	
	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
//		System.out.println(Hero.name + "たちの所持金を初期化しました");
	}
	
	
	
	
	
	

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Hero) { // oがHero型であれば
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return true;
	}
}
