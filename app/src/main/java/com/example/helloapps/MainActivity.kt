package com.example.helloapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// di awali huruf besar , passive
class MainActivity : AppCompatActivity() {
    //passive
    private val name: String = "Nove"
    //active
    private val isErrorNetwork: Boolean = true

    //di awali huruf kecil , active
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}