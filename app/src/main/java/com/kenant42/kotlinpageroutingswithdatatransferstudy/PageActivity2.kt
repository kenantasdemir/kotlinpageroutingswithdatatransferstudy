package com.kenant42.kotlinpageroutingswithdatatransferstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinpageroutingswithdatatransferstudy.databinding.ActivityPage2Binding

class PageActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityPage2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGoTo3.setOnClickListener {
            val intent = Intent(this@PageActivity2, PageActivity3::class.java)
            finish()
            //sayfa 3 e geçerken sayfa 2 yi backstackten siler
            startActivity(intent)
        }
    }
}