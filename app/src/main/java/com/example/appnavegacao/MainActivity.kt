package com.example.appnavegacao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
        var perfil = findViewById<Button>(R.id.btnperfil)
        var produtos = findViewById<Button>(R.id.btnprodutos)
        var configuracoes = findViewById<Button>(R.id.btnconfiguraçoes)
        var sobre = findViewById<Button>(R.id.btnsobre)

        perfil.setOnClickListener {
            var intentper = Intent(this, Perfil::class.java)
            startActivity(intentper)
        }

        produtos.setOnClickListener {
            var intentpro = Intent(this, Produtos::class.java)
            startActivity(intentpro)
        }

        configuracoes.setOnClickListener {
            var intentconf = Intent(this, Configuracoes::class.java)
            startActivity(intentconf)
        }

        sobre.setOnClickListener {
            var intentsob = Intent(this, Sobre::class.java)
            startActivity(intentsob)
        }


    }
}