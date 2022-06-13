package chap17.ex;

public class Main17_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました\n");
			System.out.println("-- ストックトレース(ここから) --\n");
			e.printStackTrace();
			System.out.println("\n-- ストックトレース(ここまで) --");
		}
		
		
		
		try {
			String three = "三";
			int i = Integer.parseInt(three);
		} catch (NumberFormatException e) {
			System.out.println("\nNumberFormatException例外をcatchしました");
		}
	}

}
