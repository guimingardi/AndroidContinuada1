package com.example.continuadayoshi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val btusCalculo = 600

    val aCPequeno = 7000
    val aCMedio = 12000

    fun calculo(componente: View) {
        val nome_ambiente = et_nome.text
        val metragem = et_metragem.text.toString().toInt()
        val qtd_pessoas = et_qtd_pessoas.text.toString().toInt()
        val resultado = metragem * btusCalculo + qtd_pessoas

        if(metragem <= 0 || qtd_pessoas <= 0) {
            Toast.makeText(this, "Apenas números maiores que 0 são aceitos!", Toast.LENGTH_LONG).show()

        } else if (nome_ambiente.length > 20) {
            Toast.makeText(this, "Nome do ambiente muito grande!", Toast.LENGTH_LONG).show()
        } else {
            if (resultado <= aCPequeno) {
                tv_resultado.setTextColor(Color.BLUE)
            } else if (resultado > aCPequeno && resultado <= aCMedio) {
                tv_resultado.setTextColor(Color.GREEN)
            } else {
                tv_resultado.setTextColor(Color.RED)
            }

            tv_resultado.text = "No ambiente $nome_ambiente é necessário ar condicionado de $resultado BTUs"
            tv_resultado.visibility = View.VISIBLE
        }
    }
}