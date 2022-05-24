package ex3;
public class Ex3_6{
    public static void main(String[] args) {
        System.out.print("【数当てゲーム】");
        int ans = new java.util.Random().nextInt(10);
        System.out.println("com: " + ans);
        for (int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if(ans == num) {
                System.out.println("あたり ! ");
                break;
            } else {
                System.out.println((i + 1) + "回目の挑戦");
                System.out.println("残り回数: " + (4 - i));
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}