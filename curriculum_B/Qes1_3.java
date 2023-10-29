package sample.curriculum_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Qes1_3 {
	public static void main(String[] args) {
		//System.in -> キーボード入力を受け付けるための引数	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = "";

		try {
			System.out.print("名前を入力してください：");
			name = br.readLine();
			if (name.length() == 0 || name.length() > 10) {
				System.out.println("名前を正しく入力してください。");
				return;
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		int tryCount = 0;
		Random rand = new Random();
		String[] janken = { "グー", "チョキ", "パー" };

		while (true) {
			int user;

			try {
				user = Integer.parseInt(br.readLine());

				if (user < 0 || user > 2) {
					System.out.println("正しい選択を入力してください。");
					continue;
				}
			} catch (NumberFormatException | IOException e) {
				System.out.println("正しい選択を入力してください。");
				continue;
			}

			int pc = rand.nextInt(3);

			tryCount++;

			System.out.println("相手の手は: " + janken[pc]);
			System.out.println(name + "の手は: " + janken[user]);

			if ((user == 0 && pc == 1) || (user == 1 && pc == 2) || (user == 2 && pc == 0)) {
				System.out.println("やるやん。次は俺にリベンジさせて");
				break; // 勝ったらループを抜けます
			} else if (user == pc) {
				System.out.println("DRAW あいこ もう一回しましょう！");
				continue; // 引き分けの場合、もう一度じゃんけんをします
			} else {
				String result = (user == 0 && pc == 2) ? "俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです"
						: (user == 1 && pc == 0) ? "俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！"
								: "俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ";
				System.out.println(result);
			}
		}

		System.out.println("勝つまでにかかった合計回数は" + tryCount + "回です");
	}
}
