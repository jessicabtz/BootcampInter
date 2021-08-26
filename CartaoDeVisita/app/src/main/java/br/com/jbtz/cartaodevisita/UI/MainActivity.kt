package br.com.jbtz.cartaodevisita.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.jbtz.cartaodevisita.R
import br.com.jbtz.cartaodevisita.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners(){
        binding.fab.setOnClickListener{
            val intent = Intent(this@MainActivity, addBusinessCardActivity::class.java)
            startActivity(intent)
        }
    }
}