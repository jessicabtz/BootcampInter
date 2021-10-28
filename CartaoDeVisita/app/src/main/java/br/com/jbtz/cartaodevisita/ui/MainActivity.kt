package br.com.jbtz.cartaodevisita.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import br.com.jbtz.cartaodevisita.App
import br.com.jbtz.cartaodevisita.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    private val mainViewModel: MainViewModel by viewModels{
        MainViewModelFactory((application as App).repository)
    }

    private val adapter by lazy { BusinessCardAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvCards.adapter = adapter
        getAllBusinessCard()
        insertListeners()
    }

    private fun insertListeners(){
        binding.fab.setOnClickListener{
            val intent = Intent(this@MainActivity, addBusinessCardActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getAllBusinessCard(){
        mainViewModel.getAll().observe(this, { businessCard ->
            adapter.submitList(businessCard)
        })
    }
}
