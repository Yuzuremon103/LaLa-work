package ex15;

public class Ex15_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String folder = "C:\\javadev\\";
		String file = "readme.txt";
		String path = rennketu(folder, file);
		System.out.println(path);
	}
	
	public static String rennketu(String folder, String file) {
		if(!folder.endsWith("\\")) {
			folder = folder + "\\";
		}
		return folder + file;
	}

}
