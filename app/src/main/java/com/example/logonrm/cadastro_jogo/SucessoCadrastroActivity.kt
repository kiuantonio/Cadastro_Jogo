package com.example.logonrm.cadastro_jogo

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sucesso_cadrastro.*

class SucessoCadrastroActivity : AppCompatActivity() {

    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso_cadrastro)

        //tvMensagem.text = intent.getStringExtra("nome")

        val jogo = intent.getParcelableExtra<jogo>("jogo")
        tvMensagem.text = getString(R.string.cadastro_com_sucesso,
                jogo.nome,
                jogo.genero,
                jogo.anoLancamento)

    }
}
