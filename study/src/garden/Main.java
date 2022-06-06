package garden;

import garden.Flower.Leaf;

public class Main {

	public static void main(String[] args) {
		Flower f = new Flower("紫陽花");
		f.bloom();
		Leaf l = f.makeLeaf();
		
		Rose r = new Rose("薔薇");
		r.smell();
		r.bloom();
		
		

		System.out.println(l.getName());

	}

}
