package v3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("NINZU" + Const.NINZU);
		
		// TODO 自動生成されたメソッド・スタブ
//		RandomNextHand hand = new RandomNextHand();
//		Com com1 = new Com(hand);
		
		Com com1 = new Com(new RandomNextHand());
//		Com com1 = new Com(new CleverNextHand());
		com1.setName("com1");
		com1.setHand();
		com1.setResult("draw");
		com1.setNextHand(new CleverNextHand(com1));
		
		User user = new User(new InputNextHand());
		user.setName("まえだ");
		
		Game game = new Game();
		do {
			com1.setHand();
			user.setHand();
			game.judge(com1, user);
//			game.convToJp(com1);
			game.dispResult(com1, user);
		} while (game.isNext());
		System.out.println("ありがとうございました");
		
//		System.out.println(com1);
//		System.out.println(user);
//		System.out.println(game.convToJp(com1));
	}

}
