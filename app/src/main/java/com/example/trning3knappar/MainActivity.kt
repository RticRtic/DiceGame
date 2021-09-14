package com.example.trning3knappar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var diceImage: ImageView? = null // imageView? = kan inntehålla null, men den innehåller null nu
    lateinit var userChooseSidesView: EditText
    lateinit var userGuessNrView: EditText
    lateinit var userSeeResultView: TextView
    var nrOfRoll = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        userChooseSidesView = findViewById(R.id.userChooseSidesEt)
        userGuessNrView = findViewById(R.id.guessNrEt)
        userSeeResultView = findViewById(R.id.userSeeResultTv)
        diceImage = findViewById(R.id.diceNrTwo)




        val rollButton = findViewById<Button>(R.id.button)
        rollButton.setOnClickListener { rollDice()



        }


    }
     private fun rollDice() {



         val randomDiceNr = (1..userChooseSidesView.text.toString().toInt()).random()
            nrOfRoll++

         if(randomDiceNr.toString() == userGuessNrView.text.toString()) {
             userSeeResultView.text = "Grattis!, du klarade det på $nrOfRoll, försök!"

         }
         else {
             randomDiceNr.toString() != userGuessNrView.text.toString()
             userSeeResultView.text = "Försök igen!"
         }



        val drawableResource = when(randomDiceNr) {
            1 -> R.drawable.dicenr_one
            2 -> R.drawable.dicenr_two
            3 -> R.drawable.dicenr_three
            4 -> R.drawable.dicenr_four
            5 -> R.drawable.dicenr_five
            else -> R.drawable.dicenr_six




        }
        diceImage?.setImageResource(drawableResource)


    }





}