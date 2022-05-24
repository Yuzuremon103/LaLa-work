package chap05;

public class Main210 {
	public static void main(String[] args) { 
		int[] x = {100, 200, 300};
		methodA(x);
//		System.out.println("main: " + x[0]);
		for (int i : x) {
			System.out.println(i);
		}
	}
	
	
	public static void methodA(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
			arr[i]++;
		}
	}
}
