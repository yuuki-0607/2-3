/**
 * コンソールベースの自己紹介プログラム。
 * このプログラムは、名前、年齢、趣味、好きな食べ物をコンソールに出力します。
 * 初心者向けに基本的なJavaプログラミングの構造を学ぶためのサンプルとして設計されています。
 * プログラムの情報をカスタマイズして利用することが可能です。
 */
public class Main8 {
    public static void main(String[] args) {
        // 自己紹介の情報を変数に定義
        String name = ("中山"+ "祐貴");
        int age = 34; // 年齢を記入
        String hobby = "ゲーム・料理・ゲーム・アプリ・ゲーム開発の勉強"; // 趣味を記入
        String favoriteFood = "ラーメン・パスタ・低カロリー食品"; // 好きな食べ物を記入

        // 自己紹介を出力
        System.out.println("===== 自己紹介 =====");
        System.out.println("名前：" + name + "です。");
        System.out.println("年齢:" + age + " 歳です。");
        System.out.println("趣味:" + hobby + "です。");
        System.out.println("好きな食べ物: " + favoriteFood + "です。");
 }
}
