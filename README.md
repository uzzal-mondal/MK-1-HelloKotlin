# MK-1-HelloKotlin

Kotlin Hello World
1.	Create a constraint layout.
2.	xml within create button & textview
3.	show the result click to button and countable text.
4.	First of all I am findViewBy id  button with text.
5.	When I want to button click and show the countable text . 
6.	Now I want to call button.setOnClickListner();
7.	Now push to buttn and show the countable text.
8.	I am using to count variable with including onClcikListner method.
9.	Then text variable using to setText() apeand value and count.
10.	Now I am using a if-else condition  count==10 I have the answer . else  continue.


codding:- 

package com.example.a1helloworldkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count: Int = 0;
    var languageName: String = "Kotlin"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button_id);
        var text1 = findViewById<TextView>(R.id.textView_id)

        btn.setOnClickListener {

            count++

            text1.setText("Hello , I am Kotlin Developer - " + count + "\n")

            if (count == 10) {
                text1.setText("I have the answer. - " + count)
            } else {
                text1.setText("please going on - " + count)
            }

        }
    }
}
