package chap16;

import java.util.ArrayList;

public class Main612 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 右の項の<>内のIntegerは省略可能
		ArrayList<Integer> points = new ArrayList</*Integer*/>();
		System.out.println("size:" + points.size());
		
		points.add(10);
		points.add(80);
		points.add(75);
		System.out.println("size:" + points.size());
		System.out.println(points.remove(0));
		
//		for(Integer i : points) {
//			System.out.println(i);
//		}
		
		for(int i = 0; i < points.size(); i++) {
			System.out.println("\n" + points.get(i));
		}
		
		for(int i : points) {
			System.out.println(i);
		}
		System.out.println("\n" + points.get(0));
		
		if(points.contains(80)) {
			System.out.println("\nある");
		}
	}

}
