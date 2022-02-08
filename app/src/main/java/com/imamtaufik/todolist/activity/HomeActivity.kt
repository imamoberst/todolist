package com.imamtaufik.todolist.activity

import android.os.Bundle
import com.imamtaufik.todolist.R

class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_main)
    }
}