package com.example.numberpuzzle

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var textView: TextView
    lateinit var btn9: Button
    lateinit var btnrset: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text)
        textView.setOnClickListener {
            game()

        }
        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener {
            if (btn2.text.toString().equals("")) {
                btn2.text = btn1.text
                btn1.text = ""
            } else if (btn4.text.toString().equals("")) {
                btn4.text = btn1.text
                btn1.text = ""
            }
            game()
        }

        btn2 = findViewById(R.id.btn2)
        btn2.setOnClickListener {
            if (btn3.text.toString().equals("")) {
                btn3.text = btn2.text
                btn2.text = ""
            } else if (btn5.text.toString().equals("")) {
                btn5.text = btn2.text
                btn2.text = ""
            } else if (btn1.text.toString().equals("")) {
                btn1.text = btn2.text
                btn2.text = ""
            }
            game()

        }
        btn3 = findViewById(R.id.btn3)
        btn3.setOnClickListener {
            if (btn2.text.toString().equals("")) {
                btn2.text = btn3.text
                btn3.text = ""
            } else if (btn6.text.toString().equals("")) {
                btn6.text = btn3.text
                btn3.text = ""
            }
            game()
        }
        btn4 = findViewById(R.id.btn4)
        btn4.setOnClickListener {
            if (btn1.text.toString().equals("")) {
                btn1.text = btn4.text
                btn4.text = ""
            } else if (btn5.text.toString().equals("")) {
                btn5.text = btn4.text
                btn4.text = ""
            } else if (btn7.text.toString().equals("")) {
                btn7.text = btn4.text
                btn4.text = ""
            }
            game()
        }
        btn5 = findViewById(R.id.btn5)
        btn5.setOnClickListener {
            if (btn2.text.toString().equals("")) {
                btn2.text = btn5.text
                btn5.text = ""
            } else if (btn4.text.toString().equals("")) {
                btn4.text = btn5.text
                btn5.text = ""
            } else if (btn6.text.toString().equals("")) {
                btn6.text = btn5.text
                btn5.text = ""
            } else if (btn8.text.toString().equals("")) {
                btn8.text = btn5.text
                btn5.text = ""
            }
            game()
        }
        btn6 = findViewById(R.id.btn6)
        btn6.setOnClickListener {
            if (btn3.text.toString().equals("")) {
                btn3.text = btn6.text
                btn6.text = ""
            } else if (btn5.text.toString().equals("")) {
                btn5.text = btn6.text
                btn6.text = ""
            } else if (btn9.text.toString().equals("")) {
                btn9.text = btn6.text
                btn6.text = ""
            }
            game()
        }
        btn7 = findViewById(R.id.btn7)
        btn7.setOnClickListener {
            if (btn4.text.toString().equals("")) {
                btn4.text = btn7.text
                btn7.text = ""
            } else if (btn8.text.toString().equals("")) {
                btn8.text = btn7.text
                btn7.text = ""
            }
            game()
        }
        btn8 = findViewById(R.id.btn8)
        btn8.setOnClickListener {
            if (btn7.text.toString().equals("")) {
                btn7.text = btn8.text
                btn8.text = ""
            } else if (btn5.text.toString().equals("")) {
                btn5.text = btn8.text
                btn8.text = ""
            } else if (btn9.text.toString().equals("")) {
                btn9.text = btn8.text
                btn8.text = ""
            }
            game()
        }
        btn9 = findViewById(R.id.btn9)
        btn9.setOnClickListener {
            if (btn6.text.toString().equals("")) {
                btn6.text = btn9.text
                btn9.text = ""
            } else if (btn8.text.toString().equals("")) {
                btn8.text = btn9.text
                btn9.text = ""
            }
            game()
        }
        btnrset = findViewById(R.id.btnrset)
        btnrset.setOnClickListener {
            resetgame()

        }
    }
    private fun resetgame() {

        var list = ArrayList<String>()
        var number = Random.nextInt(9)

        while (list.size < 9)
        {
            var number = Random.nextInt(9)
            if (!list.contains("" + number)) {
                list.add("" + number)
            }
        }
        for (i in 0 until list.size){
            if(list[i]=="0"){
                list[i]=""
            }
        }
        btn1.setText("" + list[0])
        btn2.setText("" + list[1])
        btn3.setText("" + list[2])
        btn4.setText("" + list[3])
        btn5.setText("" + list[4])
        btn6.setText("" + list[5])
        btn7.setText("" + list[6])
        btn8.setText("" + list[7])
        btn9.setText("" + list[8])
    }

    fun game() {
        if (btn1.text.toString().equals("1") &&
            btn2.text.toString().equals("2") &&
            btn3.text.toString().equals("3") &&
            btn4.text.toString().equals("4") &&
            btn5.text.toString().equals("5") &&
            btn6.text.toString().equals("6") &&
            btn7.text.toString().equals("7") &&
            btn8.text.toString().equals("8") &&
            btn9.text.toString().equals("")) {
            textView.setText("✨Your win✨")
        }
    }
}

