package sample.curriculum_B;

class Qes5 { public static void main(String[] args) {
	//forループの開始。iという変数を1から20まで増加させながら繰り返す。九九の表の左側の数字を表す、1から20までの範囲で計算。
	for (int i = 1; i <= 20; i++) {
		//2つ目のforループが開始される。jという変数を1から9まで増加させながら繰り返す。九九の表の上側の数字を表す。
         for (int j = 1; j <= 9; j++) {
        	 //resultという変数にiとjの掛け算の結果を格納。結果を計算。
             int result = i * j;
             //printfメソッドを使用、指定されたフォーマットで文字列を出力。
             //%03dは整数値を3桁で表示するためのフォーマット指定子。九九の表のセルの計算結果を表示。
             System.out.printf("%03d * %03d = %03d", i, j, result);
             //jが9未満の場合、列の最後でない場合、||を出力してセルを区切る。それ以外の場合は改行、新しい行に
             //iが20未満の場合、行の最後でない場合、新しい行に移る前に改行を追加します。
             if (j < 9) {
                 System.out.print(" || ");
             } else if (i < 20) {
                 System.out.println();
             }
         }
     }
 }
}

