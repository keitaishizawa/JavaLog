package jp.techacademy.keita.ishizawa.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{
    //メンバ変数
    String hobby; //趣味

    //コンストラクタ
    public Human(String namae, int nenrei, String shumi){
        name = namae;
        age = nenrei;
        hobby = shumi;
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」");
    }

    @Override
    public void think(){
        Log.d("javatest", "「私は" + this.hobby + "について考える」");
    }

}
