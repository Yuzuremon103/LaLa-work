package v3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		RandomNextHand hand = new RandomNextHand();
//		Com com1 = new Com(hand);
		
		Com com1 = new Com(new RandomNextHand());
		com1.setName("com1");
		
		User user = new User(new InputNextHand());
		user.setName("まえだ");
		
		com1.setHand();
		user.setHand();
		Game game = new Game();
		game.judge(com1, user);
//		game.convToJp(com1);
		game.dispResult(com1, user);
		
//		System.out.println(com1);
//		System.out.println(user);
//		System.out.println(game.convToJp(com1));
	}

}
