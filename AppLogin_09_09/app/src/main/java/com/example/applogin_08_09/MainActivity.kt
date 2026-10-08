package com.example.applogin_08_09

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val usuario = findViewById<EditText>(R.id.txtUsuario)
        val senha = findViewById<EditText>(R.id.txtSenha)
        val btnLogar = findViewById<Button>(R.id.btnLogar)

        btnLogar.setOnClickListener {
            if (usuario.text.toString().equals("francisco") && senha.text.toString().equals("1234")) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity,"Usuário ou senha inválido", Toast.LENGTH_LONG).show()
            }

        }
    }
}