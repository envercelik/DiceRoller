package com.envercelik.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var imageViewDice:ImageView
    private lateinit var buttonRoll:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewDice = findViewById(R.id.image_view_dice)
        buttonRoll = findViewById(R.id.button_roll)

        buttonRoll.setOnClickListener {
            rollDice()
        }

    }


    private fun rollDice() {

        when(Random.nextInt(6)+1) {

            1 -> imageViewDice.setImageResource(R.drawable.dice_1)
            2 -> imageViewDice.setImageResource(R.drawable.dice_2)
            3 -> imageViewDice.setImageResource(R.drawable.dice_3)
            4 -> imageViewDice.setImageResource(R.drawable.dice_4)
            5 -> imageViewDice.setImageResource(R.drawable.dice_5)
            6 -> imageViewDice.setImageResource(R.drawable.dice_6)
        }
    }
}