package com.example.logonrmlocal.meusjogos.listajogos
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.logonrmlocal.meusjogos.model.Jogo
import kotlinx.android.synthetic.main.meus_jogos_item.view.*


class JogoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    fun bindView(jogo: Jogo,
                 listener: (Jogo) -> Unit) = with(itemView) {
        val ivJogo = ivJogo
        val tvTitulo = tvTitulo
        val tvAnoLancamento = tvAno
        val tvDescricao = tvDescricao
        ivJogo.setImageDrawable(ContextCompat.getDrawable(context, jogo.resourceId))
        tvTitulo.text = jogo.titulo
        tvAnoLancamento.text = jogo.anoLancamento.toString()
        tvDescricao.text = jogo.descricao
        setOnClickListener { listener(jogo) }
    }
}
