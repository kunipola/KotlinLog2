package jp.techacademy.yoshihiro.kunieda.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 55, "Android") // 名前を太郎、年齢55歳で、趣味はAndroidのHumanのインスタンスを作る

        human.say()

        human.think()
    }
}