package chap17;

public class Main688 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String filename = "santa.mmm";
		try {
			if(! filename.endsWith(".mp3")) {
				throw new UnsupportedMusicFileException("未対応のファイルです");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
