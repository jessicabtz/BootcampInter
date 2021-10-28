package br.com.jbtz.cartaodevisita.ui

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.jbtz.cartaodevisita.data.BusinessCard
import br.com.jbtz.cartaodevisita.databinding.BusinessCardBinding

class BusinessCardAdapter :
    ListAdapter<BusinessCard, BusinessCardAdapter.ViewHolder>(DiffCallback()) {

        var listenerShare:(View) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = BusinessCardBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }


    inner class ViewHolder(
            private val binding: BusinessCardBinding
        ): RecyclerView.ViewHolder(binding.root){
            fun bind(item:BusinessCard){
                binding.nome.text = item.nome
                binding.telefone.text = item.telefone
                binding.email.text = item.email
                binding.empresa.text = item.empresa
                binding.site.text = item.site
                binding.cdContent.setCardBackgroundColor(Color.parseColor(item.fundoPersonalizado))
                binding.cdContent.setOnClickListener{
                    listenerShare(it)
                }
            }
        }

}

class DiffCallback : DiffUtil.ItemCallback<BusinessCard>() {
    override fun areItemsTheSame(oldItem: BusinessCard, newItem: BusinessCard) = oldItem == newItem
    override fun areContentsTheSame(oldItem: BusinessCard, newItem: BusinessCard) =
        oldItem.id == newItem.id
}