package v2;

public class Main {

	public static void main(String[] args) {
		// 戦略クラスを選ぶ
		NextHand nextHand = new CleverNextHand();
		Player com1 = new Player(nextHand);
//		Player com1 = new Player(new CleverNextHand());
		System.out.println("comの次の手は " + com1.getHand() + "です。");

		NextHand nextHand2 = new RandomNextHand();
		Player com2 = new Player(nextHand2);
//		Player com2 = new Player(new RandomNextHand());
		System.out.println("comの次の手は " + com2.getHand() + "です。");

	}

}
