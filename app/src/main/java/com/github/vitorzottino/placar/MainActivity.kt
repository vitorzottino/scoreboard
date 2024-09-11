package com.github.vitorzottino.placar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.vitorzottino.placar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var playerOneScore: Int = 0;
    private var playerTwoScore: Int = 0;

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpListeners()

    }

    private fun setUpListeners() {
        binding.button.setOnClickListener {
            playerOneScore++
            setUpScorePlayerOne()
        }
        binding.button2.setOnClickListener {
            playerTwoScore++
            setUpScorePlayerTwo()
        }

        binding.button3.setOnClickListener {
            finish()
        }

        binding.button4.setOnClickListener {
            playerOneScore = 0
            playerTwoScore = 0
            setUpScorePlayerOne()
            setUpScorePlayerTwo()
        }
    }

    private fun setUpScorePlayerOne() {
        binding.textView2.setText(playerOneScore.toString())
    }

    private fun setUpScorePlayerTwo() {
        binding.textView4.setText(playerTwoScore.toString())
    }
}