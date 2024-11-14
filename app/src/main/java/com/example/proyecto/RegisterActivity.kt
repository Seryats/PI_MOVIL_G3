
package com.example.proyecto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {


    private lateinit var buttonRegistrar:Button
    private lateinit var emailreg: EditText
    private lateinit var passwordreg: EditText
    private lateinit var LogearLink: TextView

    private lateinit var nomreg: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.register_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_header)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonRegistrar=findViewById(R.id.buttonRegistrarACT)
        emailreg=findViewById(R.id.EmailRegText)
        passwordreg=findViewById(R.id.PasswordRegText)
        LogearLink=findViewById(R.id.LogearLink)

        nomreg=findViewById(R.id.NomRegText)

        LogearLink.setOnClickListener { linklogeo() }






    }



    fun linklogeo() {
        var intent= Intent(this,LoginActivity::class.java)
        startActivity(intent)    }

}