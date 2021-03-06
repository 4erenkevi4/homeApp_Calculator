package com.example.homeapp002calk
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception
class MainActivity : AppCompatActivity(){
    lateinit var screen1: TextView
    lateinit var screen2: TextView
    lateinit var btn0: TextView
    lateinit var btn1: TextView
    lateinit var btn2: TextView
    lateinit var btn3: TextView
    lateinit var btn4: TextView
    lateinit var btn5: TextView
    lateinit var btn6: TextView
    lateinit var btn7: TextView
    lateinit var btn8: TextView
    lateinit var btn9: TextView
    lateinit var btn00: TextView
    lateinit var bracketLeft: TextView
    lateinit var bracketRight: TextView
    lateinit var divide: TextView
    lateinit var multiply: TextView
    lateinit var minus: TextView;
    lateinit var plus: TextView
    lateinit var equally: TextView
    lateinit var clear: TextView
    lateinit var dellete: TextView
    lateinit var settings: TextView
    lateinit var sqrt: TextView
    lateinit var extent: TextView
    lateinit var btndot: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        screen1 = findViewById(R.id.opeation)
        screen2 = findViewById(R.id.result)
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn00 = findViewById(R.id.btn00)
        bracketLeft = findViewById(R.id.bracketLeft)
        bracketRight = findViewById(R.id.bracketRight)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        plus = findViewById(R.id.plus)
        minus = findViewById(R.id.minus)
        equally = findViewById(R.id.equally)
        clear = findViewById(R.id.clear)
        dellete = findViewById(R.id.dellete)
        extent = findViewById(R.id.extent)
        sqrt = findViewById(R.id.sqrt)
        btndot = findViewById(R.id.btndot)
    }
    override fun onStart(){
        super.onStart()
        btn0.setOnClickListener {textAdd("0")}
        btn1.setOnClickListener {textAdd("1")}
        btn2.setOnClickListener {textAdd("2")}
        btn3.setOnClickListener {textAdd("3")}
        btn4.setOnClickListener {textAdd("4")}
        btn5.setOnClickListener {textAdd("5")}
        btn6.setOnClickListener {textAdd("6")}
        btn7.setOnClickListener {textAdd("7")}
        btn8.setOnClickListener {textAdd("8")}
        btn9.setOnClickListener {textAdd("9")}
        btn00.setOnClickListener {textAdd("00")}
        bracketRight.setOnClickListener {textAdd(")")}
        bracketLeft.setOnClickListener {textAdd("(")}
        divide.setOnClickListener {textAdd("/")}
        multiply.setOnClickListener {textAdd("*")}
        plus.setOnClickListener {textAdd("+")}
        minus.setOnClickListener {textAdd("-")}
        extent.setOnClickListener {textAdd("^")}
        sqrt.setOnClickListener {textAdd("sqrt")}
        btndot.setOnClickListener {textAdd(".")}
        clear.setOnClickListener {screen1.text = ""; screen2.text = ""}
        dellete.setOnClickListener {
            val del = screen1.text.toString()
            if(del.isNotEmpty()){screen1.text = del.substring(0, del.length-1)}}
        equally.setOnClickListener {
            try {
                val ebuild = ExpressionBuilder(screen1.text.toString()).build()
                val ind = ebuild.evaluate()
                val longRes = ind.toLong()
                if(ind ==longRes.toDouble())
                    screen2.text = longRes.toString()
                else
                    screen2.text = ind.toString()}
            catch (e:Exception){
                Log.d("Error", "ошибка: ${e.message}")
                screen2.text = "ошибка: ${e.message.toString()}"
            }
        }
    }
    fun textAdd (str: String){
        screen1.append(str)
    }
    override fun onStop(){
        super.onStop()
        btn0.setOnClickListener (null)
        btn1.setOnClickListener (null)
        btn2.setOnClickListener (null)
        btn3.setOnClickListener (null)
        btn4.setOnClickListener (null)
        btn5.setOnClickListener (null)
        btn6.setOnClickListener (null)
        btn7.setOnClickListener (null)
        btn8.setOnClickListener (null)
        btn9.setOnClickListener (null)
        btn00.setOnClickListener (null)
        bracketRight.setOnClickListener (null)
        bracketLeft.setOnClickListener (null)
        divide.setOnClickListener (null)
        multiply.setOnClickListener (null)
        plus.setOnClickListener (null)
        minus.setOnClickListener (null)
        extent.setOnClickListener (null)
        sqrt.setOnClickListener (null)
        btndot.setOnClickListener (null)
        clear.setOnClickListener (null)
        dellete.setOnClickListener (null)
        equally.setOnClickListener (null)
    }
}