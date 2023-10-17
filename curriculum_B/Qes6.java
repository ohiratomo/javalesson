package sample.curriculum_B;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Qes6 {
	public static void main(String[] args){
		//System.in -> キーボード入力を受け付けるための引数	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 try {
		      // キーボード入力を受け付ける,メソッドを呼び出す
			 String  kaden = br.readLine();
			 String[] array = kaden.split("、");
			 
			

			 for (String str: array ){
				 int kosuu = (int)(Math.random()*12);
				 switch(str){
				  case "パソコン":
				    System.out.println( "パソコンの残り台数は" + kosuu + "台です");
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
					    
				  case "テレビ" :  
				  case "ディスプレイ":
					 
					  String result = (str.equals("テレビ")) ? "テレビ" : "ディスプレイ";
					    System.out.println( result + "の残り台数は" + kosuu + "台です");
					   break;
				  
				  case "その他商品":
					    System.out.println("『 その他商品 』は指定の商品ではありません");
					    break;
					    
					 
				}
				 
			  
			 }
			 
			 
		      
		    } catch (IOException e) {
		      System.out.println(e.getMessage());
		      }
		// キーボード入力を受け付ける,メソッドを呼び出す
		

		
		}
	
	
	
}
