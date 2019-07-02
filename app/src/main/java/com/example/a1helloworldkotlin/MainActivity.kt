package com.example.a1helloworldkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     var count:Int = 0;
    var languageName:String = "Kotlin"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button_id);
        var text1 = findViewById<TextView>(R.id.textView_id)

        btn.setOnClickListener {

            count++

            text1.setText("Hello , I am Kotlin Developer - "+count+"\n")

            if (count==10){
                text1.setText("I have the answer. - "+count)
            }else{
                text1.setText("please going on - "+count)
            }

        }
    }
}
