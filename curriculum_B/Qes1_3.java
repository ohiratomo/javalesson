package sample.curriculum_B;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3{
public static void main(String[] args){
	//System.in -> キーボード入力を受け付けるための引数	
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String s = null;
	System.out.print("名前を入力してください：");
	String name = null;
	 try {
	      // キーボード入力を受け付ける,メソッドを呼び出す
	       name = br.readLine();
	      int name_length = name.length();
	      if(name.length() > 10){
	    	  System.out.println("「名前を10文字以内にしてください」");
	    	  
	    	}else if ( name_length <= 0 || name  == s ){ 
	    		System.out.println("「名前を入力してください」");
	    	
	    	}else{
	    		System.out.println("ユーザー名「" + name + "」を登録しました");
	    	}
	      
	    } catch (IOException e) {
	      System.out.println(e.getMessage());
	      }

	

	// メソッドを呼び出す 引数にNAMEを渡す
	 judgeJanken(name);     
}
//3
public static void judgeJanken(String name) {
	// キーボード入力の準備
	//クラスを使えるようにする Scanner
	Scanner stdin = new Scanner(System.in);
	//変数の定義 if文を外で使えるように先に定義
	int user;
	int pc;
	String result;
	int tryCount = 0;
	// 繰り返し  true常に繰り返す
	while(true) {
		// ＋＋は1を足す カウント
		tryCount++;
			
	// 入力した数値を変数に格納
	 user = stdin.nextInt();
	
	// 整数でも有効なのは「0，1，2」のみ
	if(user<=-1 || user >=3) {
		
	// 範囲外は無効なデータなのでやり直し
	System.out.println("【エラー】入力できるのは「0～2」です");
	continue;
	}else {
		//クラスを使えるようにする Random
		Random rand = new Random();
		
		// 0,1,2のどれかを求め、メソッドの結果として返す
	pc = rand.nextInt(3);
		if((user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)) {
			result="やるやん。次は俺にリベンジさせて";
			//勝ったので処理を止める
			break;
			
			}else if( (user==0 && pc==2))  {
			result="俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです";
			break;
			}else if( (user==1 && pc==0)) {
			result="俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！";
			break;
			}else if( (user==2 && pc==1)) {
			result="俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ";
			break;
			}else {	
			result="DRAW あいこ もう一回しましょう！";
			//配列定義
			String[] janken= {"グー","チョキ","パー"};
			System.out.println( name + "の手は:"+janken[user]);
			System.out.println( "相手の手は:"+janken[pc]);
			//結果の定義
			System.out.println(""+result);
			// もう一度じゃんけんをする
			continue;
			}
	}
	}
	//配列を定義
	String[] janken= {"グー","チョキ","パー"};
	System.out.println( name + "の手は:"+janken[user]);
	System.out.println( "相手の手は:"+janken[pc]);
	//結果の表示
	System.out.println(""+result);
	//勝つまでにかかった回数の表示
	if((user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)){
		System.out.println("勝つまでにかかった合計回数は"+tryCount+"回です");
	}
}
}








