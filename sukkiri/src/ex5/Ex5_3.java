package ex5;

public class Ex5_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String title = "なし";
		String address = "abc@abc";
		String text = "なし";
		
		email(title, address, text);

	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名 :" + title);
		System.out.println("本文 :" + text);
	}

}
