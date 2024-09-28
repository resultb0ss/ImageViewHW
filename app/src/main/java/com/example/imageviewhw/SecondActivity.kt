package com.example.imageviewhw

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imageviewhw.databinding.ActivityMainBinding
import com.example.imageviewhw.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView.clipToOutline = true

        val imageUriArray: List<Int> = listOf(R.drawable.one,R.drawable.two,R.drawable.three,
            R.drawable.four,R.drawable.five)

        binding.imageView.setImageResource(imageUriArray[0])
        var count = 0


        binding.button.setOnClickListener {
            count++
            if (count < imageUriArray.size){
                binding.imageView.setImageResource(imageUriArray[count])
            } else {
                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            }
        }

    }



}