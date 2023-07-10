package sample.curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
	
		//1．下記9個をローカル変数として宣言のみしてください
		
		// バイト型
        byte byteVar;
        
        // 短整数型
        short shortVar;

        // 整数型
        int intVar;

        // 長整数型
        long longVar;

        // 単精度浮動小数点数型
        float floatVar;

        // 倍精度浮動小数点数型
        double doubleVar;

        // 文字型
        char charVar;

        // 文字列型
        String stringVar;

        // ブーリアン型
        boolean booleanVar;
    
      //2．それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
      
        //バイト型
        byteVar = 0;
  	                                                                                       
      //短整数型
        shortVar = 0;
        
      // 整数型
        intVar = 0;

  	  // 長整数型
  	    longVar = 0L;

      // 単精度浮動小数点数型
        floatVar = 0.0f;

      // 倍精度浮動小数点数型
        doubleVar = 0.0d;

      // 文字型
        charVar = '\u0000';

      // 文字列型
        stringVar = "​null";

      // ブーリアン型
        booleanVar = true;

        
      // 3．初期化をしたそれぞれの変数に下記の値を代入してください
      
        //バイト型
        byteVar = 10;
  	                                                                                       
      //短整数型
        shortVar = 100;
        
      // 整数型
        intVar = 1000;

  	  // 長整数型
  	    longVar = 10000;

      // 単精度浮動小数点数型
        floatVar = 9.5f;

      // 倍精度浮動小数点数型
        doubleVar = 10.5;

      // 文字型
        charVar = 'a';

      // 文字列型
        stringVar = "ハロー";

      // ブーリアン型
        booleanVar = true;


    // 4,下記の通りにコンソール出力されるようにしてください
    // 11110
    System.out.println(byteVar + shortVar + intVar + (int)longVar);
    // 20
    System.out.println(floatVar + doubleVar);
    // a ハロー true
    System.out.println( charVar + stringVar +booleanVar);
    // 11130
    System.out.println( byteVar + shortVar +longVar+ intVar+ floatVar + doubleVar);
    // 10000000000
    System.out.println( byteVar* shortVar*intVar* longVar );
    // 0.105
    System.out.println(doubleVar/ shortVar);
    // -90
    System.out.println(byteVar- shortVar);
    //5.，次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    String num="4";	
    int num1=3;	
    
    System.out.println("ハローJAVA"+(num+num1));
  //6.『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
    String name = "山田太郎";
    int age = 18;
    Double height = 170.5;
    Double weight = 62.2;
    String favoritefood = "寿司";

    System.out.println("「初めまして" + name + "です」");
    System.out.println("「年齢は" + age + "歳です」");
    System.out.println("「身長は" + height + "㎝です」");
    System.out.println("「体重は" + weight + "kgです」");
    System.out.println("「好きな食べ物は" + favoritefood + "です」");
  //7.6で作成した自己紹介に続いてBMIが出力されるようにしてください
    Double BMI = 21.4 ;
    
    System.out.println("「BMIは" +BMI + "です」");
    //8.6で宣言した変数に再代入し下記の通りコンソールに出力してください
    name = "鈴木一郎";
    age = 24;
     height = 168.5;
    weight = 64.2;
    favoritefood = "オムライス";

    System.out.println("「初めまして" + name + "です」");
    System.out.println("「年齢は" + age + "歳です」");
    System.out.println("「身長は" + height + "㎝です」");
    System.out.println("「体重は" + weight + "kgです」");
    System.out.println("「好きな食べ物は" + favoritefood + "です」");
     BMI = 22.4 ;
    
    System.out.println("「BMIは" +BMI + "です」");
    //9、8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
    name = "鈴木一郎";
    age = 24+24;
     height = 168.5+168.5;
    weight = 64.2+64.2;
    favoritefood = "オムライス";

    System.out.println("「初めまして" + name + "です」");
    System.out.println("「年齢は" + age + "歳です」");
    System.out.println("「身長は" + height + "㎝です」");
    System.out.println("「体重は" + weight + "kgです」");
    System.out.println("「好きな食べ物は" + favoritefood + "です」");
     
    BMI =11.31 ;
    
     System.out.println("「BMIは" +BMI + "です」");
     
     //10、8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
     name = "鈴木一郎";
     age = 24;
      height = 168.5;
     weight = 64.2;
     favoritefood = "オムライス";
     boolean isAbove25 = age >= 25;
     System.out.println(isAbove25);
     //11,8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
     name = "鈴木一郎";
     age = 24;
      height = 168.5;
     weight = 64.2;
     favoritefood = "オムライス";
     String ageStr = String.valueOf(age);
     String heightStr = String.valueOf(height);
     String weightStr = String.valueOf(weight);

     String result = ageStr + "歳 " + heightStr + "cm " + weightStr + "kg";
     System.out.println(result);
     //12.11で変換した【年齢・身長】を整数型に変換して出力してください
     System.out.println("年齢: " + age);
     System.out.println("身長: " + height);
   //13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
     age = 48;
     height = (double) 337;

     boolean isAbove25OrHeightAbove160 = (age >= 25) || (height >= 160);

     System.out.println(isAbove25OrHeightAbove160);
}
}