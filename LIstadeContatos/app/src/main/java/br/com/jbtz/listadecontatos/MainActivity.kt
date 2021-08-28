package br.com.jbtz.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.*
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val rvList: RecyclerView by lazy { findViewById<RecyclerView>(R.id.rv_list) }
    private val adapter = ContactAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_menu)

        initDrawer()
        bindView()
        updateList()
    }

    private fun initDrawer(){
        val drawerLayout = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    private fun showToast(message: String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.item1 ->{
                showToast("Exibindo item do Menu 1")
                return true
            }
            R.id.item2 -> {
                showToast("Exibindo item do Menu 2")
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}