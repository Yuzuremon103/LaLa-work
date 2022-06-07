package v3;

import java.util.Scanner;

public class Game {
	private String msg;   // フィールドの変数は初期値なしでも可能
	private String[] hands = {"グー", "チョキ", "パー"};
	
	
	public void judge(Com com, User user) { 
		int comHand = com.getHand();
		int userHand = user.getHand();
		
//		String msg = null;    // メソッドの中で使うときは初期値が必要(ローカル変数)
		if(userHand == comHand) {
			com.setResult("draw");
			user.setResult("draw");
			msg = "引き分けでした";
		} else if((userHand + 1) % 3 == comHand) {
			com.setResult("lose");
			user.setResult("win");
			msg = user.getName() + "の勝ちです";
		} else {
			com.setResult("win");
			user.setResult("lose");
			msg = com.getName() + "の勝ちです";
		}
	}
	
	
	public void dispResult(Com com, User user) {
		System.out.println("ゲーム結果");
		System.out.println(com.getName() + ":" + this.hands[com.getHand()]);
		System.out.println(user.getName() + ":" + this.hands[user.getHand()]);
//		System.out.println(convToJp(com));
		System.out.println(msg);
	}
	
	
	
//	public String convToJp(Com com) {
//		if(com.getResult().equals("lose")) {
//			return "あなたの勝ちです";
//		} else if (com.getResult().equals("win")) {
//			return "私の勝ちです";
//		} else {
//			return "引き分けです";
//		}
//	}
	
	public boolean isNext() {
		System.out.print("\nもう一度やりますか？ (y/n) > ");
		String yesno = new Scanner(System.in).nextLine().toLowerCase();/// 受けとった文字をすべて小文字に変換
		System.out.println("");
		if (yesno.equals("y")) {
			return true;
		}
		return false;
	}
}
