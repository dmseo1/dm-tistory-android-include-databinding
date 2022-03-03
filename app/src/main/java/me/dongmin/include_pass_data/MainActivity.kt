package me.dongmin.include_pass_data

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dongmin.include_pass_data.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}