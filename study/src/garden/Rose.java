package garden;

public class Rose extends Flower {
	// このフィールドを有効にすると、smell()は、このフィールドを参照する。
	// したがって、null となる。
	// しかし、このままだと、親クラスのフィールドを参照する。
	// したがって、花 となる。
//	 public String name = "まえだ";
	
	public Rose() {}
	
	public Rose(String name) {   // 親のコンストラクタと同じ形にする
		super(name); // 親のフィールドを呼び出す
	}
	
	public void smell () {
		System.out.println(this.name + "はいい香りがする。");
	}
}
