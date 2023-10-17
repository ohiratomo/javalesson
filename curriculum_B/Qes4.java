package sample.curriculum_B;

class Qes4{
    public static void main(String[] args) {
    	 //forループが開始。iという変数を1から9まで増加させながら繰り返す。九九の表の左側の数字を表す
    	for (int i = 1; i <= 9; i++) {
    		//2つ目のforループが開始。jという変数を1から9まで増加させながら繰り返す。九九の表の上側の数字を表す。
            for (int j = 1; j <= 9; j++) {
            	//resultという変数にiとjの掛け算の結果を格納。結果を計算。
                int result = i * j;
                //printfメソッドを使用して、指定されたフォーマットで文字列を出力。
                //%02dは整数値を2桁で表示するためのフォーマット指定子。九九の表計算結果を表示。
                System.out.printf("%02d * %02d = %02d", i, j, result);
                //もしjが9未満の場合,列の最後でない場合 ||を出力してセルを区切る。それ以外の場合は改行、新しい行に
                if (j < 9) {
                    System.out.print(" || ");
                } else {
                    System.out.println();
                }
            }
            //もしiが9未満の場合 行の最後でない場合、改行を行い、新しい行に移る。各行の最後に改行が挿入。
            if (i < 9) {
                System.out.println();
            }
        }
    }
}