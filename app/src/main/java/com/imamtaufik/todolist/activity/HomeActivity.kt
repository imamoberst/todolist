package com.imamtaufik.todolist.activity

import android.os.Bundle
import com.imamtaufik.todolist.databinding.HomeMainBinding

class HomeActivity : BaseActivity() {
    private lateinit var binding : HomeMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}