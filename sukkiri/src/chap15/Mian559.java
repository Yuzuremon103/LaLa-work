package chap15;

public class Mian559 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "Java" + 5 + "and JavaScript";
		System.out.println(s1);
		if(s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいる");
		}
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("5"));
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
	}

}
