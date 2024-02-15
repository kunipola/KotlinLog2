package jp.techacademy.yoshihiro.kunieda.kotlinlog

import android.util.Log

open class Human: Animal {
    // プロパティ
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age){
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name + "です。" + "年は" + this.age + "です。")
    }

    // Thinkableインターフェースのメソッドをオーバーライド
    fun think(){
        Log.d("kotlintest","私は" + this.hobby + "について考える")
    }
}