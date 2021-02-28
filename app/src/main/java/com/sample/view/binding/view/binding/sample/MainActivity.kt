package com.sample.view.binding.view.binding.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.sample.view.binding.view.binding.sample.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setData()
    }

    private fun setData() {
        binding.textEmail.text = "Satya"
        binding.textEmail.setOnClickListener {
            //Do some awful stuff here
        }
    }
}