package jp.techacademy.keita.ishizawa.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human hito = new Human("ドナルド・トランプ", 70, "米国第一主義");   //Humanのインスタンスを作る
        hito.say();
        hito.think();
        }

}

