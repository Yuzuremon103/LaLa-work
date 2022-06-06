package garden;

public class Flower {
	private String flowerName;
	
	public Flower() {
		this.flowerName = "花";
	}
	
	public Flower(String name) {
		this.flowerName = name;
	}
	
//	setName(String name) {
//		this.name = name;
//	}
	
	public void bloom() {
		System.out.println(flowerName + "が咲いた。");
	}

	public String getName() {
		return flowerName;
	}

	public void setName(String name) {
		this.flowerName = name;
	}
	
	
	// flower
	public Leaf makeLeaf() {
		Leaf l = new Leaf("葉");
		return l;
	}
	
	class Leaf {  // public class Leafにするなら別ファイルにしなければならない
		private String name;
		
		public Leaf (String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
	}
}
