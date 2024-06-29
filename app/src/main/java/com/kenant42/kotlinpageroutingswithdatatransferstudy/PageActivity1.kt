package com.kenant42.kotlinpageroutingswithdatatransferstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinpageroutingswithdatatransferstudy.databinding.ActivityMainBinding
import com.kenant42.kotlinpageroutingswithdatatransferstudy.databinding.ActivityPage1Binding


class PageActivity1 : AppCompatActivity() {
    private lateinit var binding: ActivityPage1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nameTextView.text = intent.getStringExtra("name")
        binding.ageTextView.text = intent.getIntExtra("age", 0).toString()
        binding.heightTextView.text = intent.getDoubleExtra("height", 0.0).toString()
        binding.isMarriedTextView.text = intent.getBooleanExtra("isMarried", false).toString()


        binding.buttonGoTo2.setOnClickListener {
            val intent = Intent(this@PageActivity1, PageActivity2::class.java)
            startActivity(intent)
        }


    }

    override fun onBackPressed() {
        val newIntent = Intent(Intent.ACTION_MAIN)
        newIntent.addCategory(Intent.CATEGORY_HOME)
        newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(newIntent)
        super.onBackPressed()
    }
}