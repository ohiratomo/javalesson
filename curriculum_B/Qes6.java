package sample.curriculum_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Qes6 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String kaden = br.readLine();
			String[] array = kaden.split("、");

			for (String str : array) {
				int kosuu = (int) (Math.random() * 12);
				boolean isSpecifiedItem = true; // Flag to check if the item is specified

				switch (str) {
				case "パソコン":
					System.out.println("パソコンの残り台数は" + kosuu + "台です");
					break;

				case "冷蔵庫":
					System.out.println("冷蔵庫の残り台数は" + kosuu + "台です");
					break;

				case "扇風機":
					System.out.println("扇風機の残り台数は" + kosuu + "台です");
					break;

				case "洗濯機":
					System.out.println("洗濯機の残り台数は" + kosuu + "台です");
					break;

				case "加湿器":
					System.out.println("加湿器の残り台数は" + kosuu + "台です");
					break;

				case "テレビ":
				case "ディスプレイ":
					String result = (str.equals("テレビ")) ? "テレビ" : "ディスプレイ";
					int max = (result.equals("テレビ")) ? 11 : 10; // Change max for "ディスプレイ"
					kosuu = (int) (Math.random() * (max + 1));
					System.out.println(result + "の残り台数は" + kosuu + "台です");
					break;

				default:
					isSpecifiedItem = false;
					System.out.println(str + "は指定の商品ではありません");
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}