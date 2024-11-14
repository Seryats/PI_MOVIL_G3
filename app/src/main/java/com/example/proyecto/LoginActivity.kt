
package com.example.proyecto

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.EditText

class LoginActivity : AppCompatActivity() {


    private lateinit var buttonRegistra:Button
    private lateinit var email:EditText
    private lateinit var password:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        buttonRegistra=findViewById(R.id.buttonRegistra)
        email=findViewById(R.id.EmailText)
        password=findViewById(R.id.PasswordTxt)


        buttonRegistra.setOnClickListener { registra() }






    }
    fun registra() {
        var intent=Intent(this,RegisterActivity::class.java)
        startActivity(intent)    }



}