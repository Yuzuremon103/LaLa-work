package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main682 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		sub();
	}
	
	
	public static void sub() {
		try {
			subsub();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

// throws IOException はもしもエラーが起これば、呼び出し元(sub())に委ねる。
	public static void subsub() throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("hello");
		fw.close();
	}
}
