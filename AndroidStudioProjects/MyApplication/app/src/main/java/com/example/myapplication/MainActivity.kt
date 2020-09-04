package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun cliqueAqui(componente: View) {
        Toast.makeText(this, "cu", Toast.LENGTH_LONG).show()
    }

    fun mexerTexto(componente: View) {
        val novo_texto = et_usuario.text
        tv_topo.text = novo_texto
        tv_secreto.visibility = View.VISIBLE
    }
}