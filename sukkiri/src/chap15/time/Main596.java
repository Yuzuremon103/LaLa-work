package chap15.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main596 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 文字列からLocalDateを生成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		System.out.println(ldate);
		
		
		// 1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		System.out.println(ldatep);
		
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		
		// 現在日時との比較
		LocalDate now = LocalDate.now();
		
		if(now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}
		
		if(now.isBefore(ldatep)) {
			System.out.println("1000日後は未来日付です");
		}

	}

}
