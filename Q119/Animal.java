package sample.Q119;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Animal {
    private static int animalCount = 0;

    public static void main(String[] args) {
        Animal animalInstance = new Animal();

        // Q1: Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Animal.Dog Dog = animalInstance.new Dog("らいおん");
        // 動物の名前をコンソールに出力
        System.out.println(Dog.getAnimalName());

        // Q2: Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Animal.Dog Dogg = animalInstance.new Dog("らいおん");
        System.out.println("動物の数: " + Animal.getAnimalCount());

        // Q3: 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください。
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("現在の日時: " + formattedDateTime);
    }

    // DogクラスをAnimalクラスの内部クラスとして定義
    class Dog {
        private String animalName;

        // コンストラクタ: Dogオブジェクトを作成する際に動物の名前を指定できるようにする
        public Dog(String name) {
            animalName = name;
            // インスタンスが作成されるたびに動物の数を増やす
            Animal.animalCount++;
        }

        // 動物の名前を取得するメソッド
        public String getAnimalName() {
            return "" + animalName + "";
        }
    }

    // 動物の数を取得するメソッド
    public static int getAnimalCount() {
        return animalCount;
    }
}
