package chap17;

import java.io.FileWriter;
import java.io.IOException;

public class Main655 {

	public static void main(String[] args) {
		
		// ③をコピーして作成④
		String txt = null;
		try (FileWriter fw = new FileWriter("data.txt")) {
			fw.write(txt);
		} catch (IOException | NullPointerException e) {
			System.out.println("書き込み失敗 : " + e.getMessage());
		}

		
		
		
//		// ②をコピーして作成③
//		String txt = null;
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter("data.txt");
//			fw.write(txt);
//		} catch (IOException | NullPointerException e) {
//			System.out.println("書き込み失敗 : " + e.getMessage());
//		} finally {
//			if(fw != null) {
//				try {
//					fw.close();
//				} catch(IOException e) {
//					;
//	//				e.printStackTrace();
//				}
//			}
//		}

		
		
		// ①をコピーして作成(②)
//		try {
//			FileWriter fw = new FileWriter("data.txt");
//			fw.write("hello");
//			fw.close();
//		} catch (IOException e) {
//			// IOとはinput,output
//			e.printStackTrace();
//			System.out.println("エラー : " + e.getMessage());
//		}
		
		
		// ①
//		try {
//			FileWriter fw = new FileWriter("data.txt");
//			fw.write("hello!");
//			fw.close();
//		} catch (IOException e) {
//			// ioとはinput,output
//			e.printStackTrace();
//			System.out.println("エラーです。中断します");
//		}
	}

}
