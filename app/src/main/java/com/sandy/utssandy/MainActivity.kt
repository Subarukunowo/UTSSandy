package com.sandy.utssandy

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sandy.utssandy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener {
            hitungPrismaSegitiga()
        }
    }

    private fun hitungPrismaSegitiga() {
        val alasStr = binding.nilaia.text.toString()
        val tinggiSegitigaStr = binding.nilaib.text.toString()
        val tinggiPrismaStr = binding.nilaic.text.toString()

        if (alasStr.isNotEmpty() && tinggiSegitigaStr.isNotEmpty() && tinggiPrismaStr.isNotEmpty()) {
            val alas = alasStr.toDouble()
            val tinggiSegitiga = tinggiSegitigaStr.toDouble()
            val tinggiPrisma = tinggiPrismaStr.toDouble()
            val luasAlas = 0.5 * alas * tinggiSegitiga
            val kelilingAlas = 3 * alas
            val luasPermukaan = 2 * luasAlas + kelilingAlas * tinggiPrisma

            val volume = luasAlas * tinggiPrisma


            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("luasPermukaan", luasPermukaan)
            intent.putExtra("volume", volume)
            startActivity(intent)
        } else {
            Toast.makeText(this, getString(R.string.mohon_masukkan_angka_valid), Toast.LENGTH_SHORT).show()
        }
    }
}
