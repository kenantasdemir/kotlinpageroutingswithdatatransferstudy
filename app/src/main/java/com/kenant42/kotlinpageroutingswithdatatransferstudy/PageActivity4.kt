package com.kenant42.kotlinpageroutingswithdatatransferstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kenant42.kotlinpageroutingswithdatatransferstudy.databinding.ActivityPage4Binding

class PageActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityPage4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPage4Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val userObject = intent.getSerializableExtra("user") as User
        binding.nameTextView4.text = userObject.name
        binding.ageTextView4.text = userObject.age.toString()
        binding.heightTextView4.text = userObject.height.toString()
        binding.isMarriedTextView4.text = userObject.isMarried.toString()

        binding.buttonGoToBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}