package br.com.jbtz.cartaodevisita.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import br.com.jbtz.cartaodevisita.App
import br.com.jbtz.cartaodevisita.R
import br.com.jbtz.cartaodevisita.data.BusinessCard
import br.com.jbtz.cartaodevisita.databinding.ActivityAddBusinessCardBinding

class addBusinessCardActivity : AppCompatActivity() {
    private val binding by lazy{ ActivityAddBusinessCardBinding.inflate(layoutInflater)}
    private val mainViewModel: MainViewModel by viewModels{
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners(){
        binding.btnClose.setOnClickListener {
            finish()
        }
        binding.btnSave.setOnClickListener {
            val businessCard = BusinessCard(
                nome = binding.nvNome.editText?.text.toString(),
                empresa = binding.nvEmpresa.editText?.text.toString(),
                telefone = binding.nvTelefone.editText?.text.toString(),
                site = binding.nvSite.editText?.text.toString(),
                email = binding.nvEmail.editText?.text.toString(),
                fundoPersonalizado = binding.nvCor.editText?.text.toString()
            )
            mainViewModel.insert(businessCard)
            Toast.makeText(this, R.string.label_show_success, Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}