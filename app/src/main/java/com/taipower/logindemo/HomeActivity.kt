package com.taipower.logindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.widget.TextView

/**
 * Created by Taipower on 10/31/2017 AD.
 */
class HomeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val txtHello = findViewById<RecyclerView>(R.id.txtHello) as TextView
        val INTENT_USER_ID = "user_id"
        val user_id = intent.getStringExtra(INTENT_USER_ID)
        txtHello.setText("Hello " + user_id)
    }
}