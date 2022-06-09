package chap15;

import java.util.Calendar;
import java.util.Date;

public class Main583 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar c = Calendar.getInstance();
		
		c.set(2019, 8, 22/*, 1, 23, 45*/); // 日まででも可能(時分などは現在のもの)
		System.out.println(c);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();  // date型に変換
		System.out.println(d);   // toStringメソッドが動き、この形になる。
		
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}

}
