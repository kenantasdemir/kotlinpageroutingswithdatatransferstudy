package com.kenant42.kotlinpageroutingswithdatatransferstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinpageroutingswithdatatransferstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoTo1.setOnClickListener {
            val intent = Intent(this@MainActivity, PageActivity1::class.java)
            intent.putExtra("name", "Kenan")
            intent.putExtra("age", 24)
            intent.putExtra("height", 1.70)
            intent.putExtra("isMarried", false)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
    }
}