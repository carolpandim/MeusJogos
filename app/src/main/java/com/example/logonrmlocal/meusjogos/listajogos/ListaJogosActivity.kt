package com.example.logonrmlocal.meusjogos.listajogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.example.logonrmlocal.meusjogos.model.Jogo
import com.example.logonrmlocal.meusjogos.R
import com.example.logonrmlocal.meusjogos.detalhejogo.DetalheActivity

import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)
        rvJogo.adapter = JogosAdapter(jogos(), this, {jogo ->
            val detalheIntent = Intent(this,DetalheActivity::class.java)
            detalheIntent.putExtra("Jogo",jogo)
            startActivity(detalheIntent)
        })
//Grid
//val layoutManager = GridLayoutManager(this, 2)
//Grade escalonável
/*val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)*/
//Lista na horizontal
//val layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
//Lista na vertical
        val layoutManager = LinearLayoutManager(this)
        rvJogo.layoutManager = layoutManager
    }
    private fun jogos(): List<Jogo> {
        return listOf(
                Jogo(R.drawable.spider,
                        "Spiderman",
                        2018,
                        "Não Informado"),
                Jogo(R.drawable.fifa,
                        "Fifa",
                        2018,
                        "Não Informado"),
                Jogo(R.drawable.gameofthrones,
                        "Game of Thrones",
                        2018,
                        "Não Informado"),
                Jogo(R.drawable.godofar,
                        "God of Ar",
                        2018,
                        "Não Informado")
                )}
}

