package ex4;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		int[] numbers = {3, 4, 9};
		int[] numbers = new int[2];
		numbers[0] = new java.util.Random().nextInt(9) + 1;
//		numbers[1] = new java.util.Random().nextInt(9) + 1;
		
		do {
			numbers[1] = new java.util.Random().nextInt(9) + 1;			
		} while(numbers[0] == numbers[1]);
		
		
		System.out.println("1桁の数字を入力してください");

		int input = new java.util.Scanner(System.in).nextInt();
		
		
		for (int num : numbers) {
			if(input == num) {
				System.out.println("あたり");
				break;
			} else {
				System.out.println("はずれ");
			}
		}
	}

}
