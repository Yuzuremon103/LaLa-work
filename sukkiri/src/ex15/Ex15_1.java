package ex15;

public class Ex15_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
//			sb.append(i + 1).append(",");
			sb.append(i + 1 + ",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] a = s.split(",");
		System.out.println(a);
	}

}
