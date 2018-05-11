package com.example.logonrm.cadastro_jogo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)


        btLimpar.setOnClickListener{
            etNome.setText("")
            etAno.setText("")
            etGenero.setText("")
        }

        btCadastrar.setOnClickListener {
            val  telaSucesso = Intent (this,
                    SucessoCadrastroActivity ::class.java)

            val jogo = jogo (
                etNome.text.toString(),
                etGenero.text.toString(),
                etAno.text.toString().toInt()
                )

            telaSucesso.putExtra("jogo", jogo)
            startActivity(telaSucesso)
            /*telaSucesso.putExtra("nome", etNome.text.toString())
            startActivity(telaSucesso)*/
            limpar()


        }
    }

    fun limpar (){
        etNome.setText("")
        etAno.setText("")
        etGenero.setText("")
    }
}
