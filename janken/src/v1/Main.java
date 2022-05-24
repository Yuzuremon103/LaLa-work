package v1;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String userName = "";
		
		if (args.length == 1) {
			userName = args[0];
		} else {
			userName = "あくたん";
		}
		
		
		
		String[] hand = {"グー", "チョキ", "パー"};
		
		int com = new java.util.Random().nextInt(3);
		
		int user = userInput();
		
		System.out.println("comの手は" + hand[com] + "です。");
		System.out.println(userName + "の手は" + hand[user] + "です。");
		
		judge(com, user, userName);
	}

	
	public static int userInput() {
		System.out.println("0: グー  1: チョキ  2: パー");
		System.out.print("数字で入力してください > ");
		int num = new java.util.Scanner(System.in).nextInt();
		return num;
	}
	
	
	public static void judge(int com, int user, String name) { 
		if(com == user) {
			System.out.println("引き分けです");
		} else if((user + 1) % 3 == com) {
			System.out.println(name + "の勝ちです");
		} else {
			System.out.println("comの勝ちです");
		}
	}
}
