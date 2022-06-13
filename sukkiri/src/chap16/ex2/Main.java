package chap16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  // ↓Bookクラス
		List<Book> bookList = new ArrayList<>();
		
		Book b1 = new Book("星の王子さま", "サン・テグジュペリ");
		bookList.add(b1);
		
		Book b2 = new Book("ドグラ・マグラ", "夢野久作");
		bookList.add(b2);
		
		Book b3 = new Book("老人と海", "アーネスト・ヘミングウェイ");
		bookList.add(b3);
		
		Book b4 = new Book("不思議の国のアリス", "ルイス・キャロル");
		bookList.add(b4);
		
		
//		こんなのも可能
//		Book b = new Book("星の王子さま", "サン・テグジュペリ");
//		bookList.add(b);
//		
//		b = new Book("名探偵コナン", "青山剛昌");
//		bookList.add(b);
//		
//		b = new Book("スパイ・ファミリー", "遠藤達哉");
//		bookList.add(b);
//		
//		b = new Book("不思議の国のアリス", "ルイス・キャロル");
//		bookList.add(b);

		
		
		
		for (Book book : bookList) {
			System.out.println("「" + book.getTitle() + "」" + book.getAuthor());
		}
	}

}
