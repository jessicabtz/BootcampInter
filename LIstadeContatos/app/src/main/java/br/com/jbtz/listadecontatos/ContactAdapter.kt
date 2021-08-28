package br.com.jbtz.listadecontatos

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter : RecyclerView.Adapter<>(){// fazer o gerenciamento da lista como um td
    private val list:MutableList<Contact> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
    TODO("Not yet implemented")
}

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ???, position: Int) {
        TODO("Not yet implemented")
    }

    class ContactAdapterViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){ // gerencia cada elemento da lita

    }
}