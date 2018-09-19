package com.example.logonrmlocal.meusjogos.listajogos

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.logonrmlocal.meusjogos.R
import com.example.logonrmlocal.meusjogos.model.Jogo

class JogosAdapter(private val jogos: List<Jogo>,
                  private val context: Context,
                  val listener: (Jogo) -> Unit) : RecyclerView.Adapter<JogoViewHolder>() {
//Método que recebe o ViewHolder e a posição da lista.
//Aqui é recuperado o objeto da lista de Objetos pela posição e associado à ViewHolder.
    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        val jogo= jogos[position]
        holder?.let {
            it.bindView(jogo, listener)
        }
    }
    //Método que deverá retornar layout criado pelo ViewHolder já inflado em uma view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.meus_jogos_item, parent, false)
        return JogoViewHolder(view)
    }
    //Método que deverá retornar quantos itens há na lista.
    override fun getItemCount(): Int {
        return jogos.size
    }

    interface ClickListener {
        fun onClick(view: View, position: Int)
    }
/*
* Vale ressaltar que os métodos onCreateViewHolder e onBindViewHolder não são
chamados
* para todos os itens inicialmente, eles são chamados apenas para os itens visíveis
para o usuário.
* Quando o usuário sobe e desce a lista, estes dois métodos são chamados novamente
associando a view
* reciclada ao conteúdo daquela posição que agora será visível.
* */
}