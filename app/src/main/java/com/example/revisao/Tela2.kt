package com.example.revisao

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.revisao.databinding.ActivityMainBinding
import com.example.revisao.databinding.ActivityTela2Binding

class Tela2 : AppCompatActivity() {
    private lateinit var binding: ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityTela2Binding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        val loginUsuario = intent.getStringExtra("LOGIN_USUARIO") ?: "Desconhecido"
        binding.txtUsuario.text = "Bem-vindo, $loginUsuario"

    }
}