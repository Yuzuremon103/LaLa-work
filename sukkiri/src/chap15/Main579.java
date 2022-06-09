package chap15;

public class Main579 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
			System.out.println("エラーが起こった");
			System.out.println(e.getMessage());
		}
		
		// ここで何らかの時間がかかる処理
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は..." + (end - start) + "ミリ秒でした");
		
	}

}
