package com.kenant42.kotlinpageroutingswithdatatransferstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinpageroutingswithdatatransferstudy.databinding.ActivityPage3Binding

class PageActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityPage3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonGoTo4.setOnClickListener {
            val intent = Intent(this@PageActivity3, PageActivity4::class.java)
            val user = User("Kenan", 24, 1.7, false)
            intent.putExtra("user", user)
            startActivity(intent)
        }
    }


    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@PageActivity3, PageActivity1::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
    }


}