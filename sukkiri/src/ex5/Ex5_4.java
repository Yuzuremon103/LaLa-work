package ex5;

public class Ex5_4 {
	public static void main(String[] args) {
		double bottom = 5.0;
		double height = 10.0;
		double radius = 10.0;
		System.out.println(calcTriangleArea(bottom, height));
		System.out.println(calcCircleArea(radius));
	}
	
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2.0;
		return area;
	}
	
	
	public static double calcCircleArea(double radius) {
		double area = (radius * radius) * 3.14;
		return area;
	}

}
