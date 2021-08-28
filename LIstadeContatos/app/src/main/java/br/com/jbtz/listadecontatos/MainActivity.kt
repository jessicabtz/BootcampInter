package br.com.jbtz.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy { findViewById<RecyclerView>(R.id.rv_list) }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        updateList()
    }

    private fun bindView(){
        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this
        )
    }

    private fun updateList(){
        adapter.updateList(
            arrayListOf(
                Contact("Jéssica Beatriz","(00)00000-0000","img.png"),
                Contact("Igor Ferrani", "(11)11111-1111", "img2.png")
            )
        )
    }
}