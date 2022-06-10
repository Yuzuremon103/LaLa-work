package chap15.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main594 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// LocalDateTimeの生成方法
		// 現在日時の取得
		LocalDateTime l1 = LocalDateTime.now();
		System.out.println(l1);
		
		// 時間指定 
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0);
		System.out.println(l2);
		
		LocalDateTime l2_1 = LocalDateTime.of(2020, 1, 1, 23, 55);
		System.out.println(l2_1);
		
		
		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		System.out.println(z1);
		
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(l3);
	}

}
