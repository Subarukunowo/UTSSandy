package com.sandy.utssandy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sandy.utssandy.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val luasPermukaan = intent.getDoubleExtra("luasPermukaan", 0.0)
        val volume = intent.getDoubleExtra("volume", 0.0)


        binding.tvLuasPermukaan.text = getString(R.string.luas_permukaan, luasPermukaan)
        binding.tvVolume.text = getString(R.string.volume, volume)


        binding.btnKembali.setOnClickListener {
            finish()
        }
    }
}
