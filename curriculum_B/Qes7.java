
package sample.curriculum_B;
import java.util.Scanner;
class Qes7 { 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int ninnzuu;
        while (true) {
            System.out.print("生徒の人数を入力してください（2以上）：");
            ninnzuu = scanner.nextInt();
            if (ninnzuu >= 2) {
                break;
            }
        }

        double[] num = new double[ninnzuu + 1];
        double[] heikinnten = new double[4]; // 各教科の平均点を格納する配列 (0: 英語, 1: 数学, 2: 理科, 3: 社会)
        double totalAverage = 0.0; // 全体の平均点を格納する変数

        for (int i = 1; i <= ninnzuu; i++) {
            System.out.println(i + "人目の成績を入力してください:");

            System.out.print("英語の点数: ");
            double english = scanner.nextDouble();

            System.out.print("数学の点数: ");
            double math = scanner.nextDouble();

            System.out.print("理科の点数: ");
            double science = scanner.nextDouble();

            System.out.print("社会の点数: ");
            double social = scanner.nextDouble();

            double average = (english + math + science + social) / 4.0;
            num[i] = average;

            // 各教科の平均点 格納
            heikinnten[0] += english;
            heikinnten[1] += math;
            heikinnten[2] += science;
            heikinnten[3] += social;
         
            // 全体の平均点 格納
            totalAverage += average;
        }
        

        for (int i = 1; i <= ninnzuu; i++) {
            System.out.println(i + "人目の平均点は" + num[i] + "点です。");
        }

        // 各教科の平均点を計算
        int kakukyoka = 4; // 英語、数学、理科、社会の教科数
        for (int i = 0; i < kakukyoka; i++) {
        	heikinnten[i] /= ninnzuu;
            System.out.println(getSubjectName(i) + "の平均点は" + heikinnten[i] + "点です。");
        }
     // 全体の平均点を計算
        totalAverage /= ninnzuu;
        System.out.println("全体の平均点は" + totalAverage + "点です。");
    }
    

    // 教科名を取得する関数
    public static String getSubjectName(int subjectIndex) {
        String[] subjects = {"英語", "数学", "理科", "社会"};
        return subjects[subjectIndex];
    }
}